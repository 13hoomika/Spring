package com.xworkz.ecomapp.repository;

import com.xworkz.ecomapp.entity.ProductEntity;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class ProductRepoImpl implements ProductRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");
    @Override
    public Boolean save(ProductEntity entity) {
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
        } finally {
            em.close();
        }
        return isSaved;
    }
}
