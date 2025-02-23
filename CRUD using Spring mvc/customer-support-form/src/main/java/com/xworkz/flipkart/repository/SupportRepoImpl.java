package com.xworkz.flipkart.repository;

import com.xworkz.flipkart.entity.SupportEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;
@Repository
public class SupportRepoImpl implements SupportRepo{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("springmvc");
    @Override
    public Boolean save(SupportEntity entity) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return  true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
            return false;
        }finally {
            em.close();
        }
    }

    @Override
    public List<SupportEntity> getRequests() {
        try {
            EntityManager em = emf.createEntityManager();
            return em.createNamedQuery("getRequest",SupportEntity.class).getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Collections.emptyList();    }

    @Override
    public boolean deleteRequest(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.createNamedQuery("deleteRequest").setParameter("id",id).executeUpdate();
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
    public SupportEntity findById(int id) {
        return ((SupportEntity)emf.createEntityManager().createNamedQuery("getById").setParameter("id",id).getSingleResult());
    }

    @Override
    public Boolean updateForm(SupportEntity entity) {
        EntityManager em = emf.createEntityManager();
        boolean isUpdated = false;
        try {
            em.getTransaction().begin();
            SupportEntity mergeEntity = em.merge(entity);
            em.getTransaction().commit();
            if (mergeEntity != null) isUpdated = true;
            return isUpdated;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            return isUpdated;
        } finally {
            em.close();
        }
    }
}
