package com.xworkz.xworkzapp.repo;

import com.xworkz.xworkzapp.entity.EnrollmentEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

@Repository
public class EnrollmentRepoImpl implements EnrollmentRepo {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("springmvc");
    @Override
    public Boolean save(EnrollmentEntity entity) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (entityManager.getTransaction().isActive())
                entityManager.getTransaction().rollback();
            return false;
        }finally {
            entityManager.close();
        }

    }

    @Override
    public List<EnrollmentEntity> getAllEnrollments() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery("getAllData", EnrollmentEntity.class).getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }

    @Override
    public Boolean delete(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.createNamedQuery("deleteData").setParameter("id",id).executeUpdate();
            em.getTransaction().commit();
            return true;
        }catch (Exception e) {
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
    public EnrollmentEntity getById(int id) {
        return ((EnrollmentEntity) emf.createEntityManager().createNamedQuery("getById").setParameter("id", id).getSingleResult());
    }

    @Override
    public Boolean updateEnrollment(EnrollmentEntity entity) {
        EntityManager em = emf.createEntityManager();
        boolean isUpdate = false;
        try {
            em.getTransaction().begin();
            EnrollmentEntity merge = em.merge(entity);
            em.getTransaction().commit();
            if (merge != null) isUpdate = true;
            return isUpdate;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            return false;
        } finally {
            em.close();
        }
    }
}
