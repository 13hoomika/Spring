package com.xworkz.jobhuntapp.repo;

import com.xworkz.jobhuntapp.entity.ApplicationEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Repository
public class ApplicationRepoImpl implements ApplicationRepo{
    @Override
    public Boolean store(ApplicationEntity entity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("springmvc");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
            return false;
        }finally {
            em.close();
        }
    }
}
