package com.xworkz.uidaiapp.repository;

import com.xworkz.uidaiapp.entity.AadhaarAuthEntity;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Component
public class AadhaarAuthRepoImpl implements AadhaarAuthRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
    @Override
    public Boolean save(AadhaarAuthEntity entity) {
        EntityManager em = emf.createEntityManager();
        boolean isSaved = false;
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            isSaved = true;
        } catch (Exception e) {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            System.out.println(e.getMessage());
        }finally {
            em.close(); // Ensure EntityManager is closed properly
        }
        return isSaved;
    }

    @Override
    public List<AadhaarAuthEntity> getAllAadhaar() {
        return emf.createEntityManager().createNamedQuery("getAllDetails", AadhaarAuthEntity.class).getResultList();
    }

    @Override
    public AadhaarAuthEntity getById(int id) {
        return emf.createEntityManager().find(AadhaarAuthEntity.class,id);
    }

    @Override
    public AadhaarAuthEntity getByName(String name) {
        EntityManager em = emf.createEntityManager();
        try {
            return  em.createNamedQuery("getByName", AadhaarAuthEntity.class)
                    .setParameter("name", name).getSingleResult();
        } catch (NoResultException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }

    @Override
    public AadhaarAuthEntity getByAadhaarNumber(Long aadhaarNum) {
        try {
            Query getByNumberQuery = emf.createEntityManager()
                    .createNamedQuery("getByNumber")
                    .setParameter("aNum", aadhaarNum);
            AadhaarAuthEntity singleResult = (AadhaarAuthEntity) getByNumberQuery.getSingleResult();
            return singleResult;
        } catch (NoResultException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Integer updateDobById(int id, String dateOfBirth) {
        EntityManager em = emf.createEntityManager();
        int row = 0;
        try {
            em.getTransaction().begin();
            row = em.createNamedQuery("updateById")
                    .setParameter("dob",dateOfBirth)
                    .setParameter("id",id)
                    .executeUpdate();
            em.getTransaction().commit();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback(); // Rollback to prevent partial update
            }
            System.out.println(e.getMessage());
        }finally {
            em.close();
        }
        return row;
    }

    @Override
    public Integer updateAddressByName(String name, String address) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            int row = em.createNamedQuery("updateByName")
                    .setParameter("address",address)
                    .setParameter("name",name)
                    .executeUpdate();
            em.getTransaction().commit();
            return row;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.out.println(e.getMessage());
            return 0;
        }finally {
            em.close();
        }
    }

    @Override
    public Integer deleteAadhaarById(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            int row = em.createNamedQuery("deleteById")
                    .setParameter("id", id)
                    .executeUpdate();
            em.getTransaction().commit();
            return row;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        } finally {
            em.close();
        }
    }


}
