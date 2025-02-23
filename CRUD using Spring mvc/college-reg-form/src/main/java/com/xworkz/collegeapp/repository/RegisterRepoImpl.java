package com.xworkz.collegeapp.repository;

import com.xworkz.collegeapp.entity.RegisterEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

@Repository
public class RegisterRepoImpl implements RegisterRepo {
    private EntityManagerFactory emf= Persistence.createEntityManagerFactory("springmvc");

    @Override
    public Boolean save(RegisterEntity registerEntity) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(registerEntity);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (entityManager.getTransaction().isActive()){
                entityManager.getTransaction().rollback();
                return false;
            }else {
                return false;
            }
        } finally {
            entityManager.close();
        }
    }

    @Override
    public List<RegisterEntity> getAllData() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery("getAllDataQuery", RegisterEntity.class).getResultList();
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
                System.out.println(e.getMessage());
            }
            return null;
        }finally {
            em.close();
        }
    }

    @Override
    public boolean deleteById(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.createNamedQuery("deleteByIdQuery").setParameter("id",id).executeUpdate();
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
                System.out.println(e.getMessage());
            }
            return false;
        }finally {
            em.close();
        }
    }

    @Override
    public RegisterEntity getById(int id) {
        return ((RegisterEntity) emf.createEntityManager().createNamedQuery("getById").setParameter("id", id).getSingleResult());
    }

    @Override
    public Boolean update(RegisterEntity entity) {
        EntityManager em = emf.createEntityManager();
        boolean isUpdated = false;
        try {
            em.getTransaction().begin();
            RegisterEntity merge = em.merge(entity);
            em.getTransaction().commit();
            if (merge != null){
                isUpdated = true;
            }
            return isUpdated;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            return isUpdated;
        } finally {
            em.close();
        }
    }
}

