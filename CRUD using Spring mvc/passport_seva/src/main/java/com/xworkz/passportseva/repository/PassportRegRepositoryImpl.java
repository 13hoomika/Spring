package com.xworkz.passportseva.repository;

import com.xworkz.passportseva.entity.PassportRegEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@Repository
public class PassportRegRepositoryImpl implements PassportRegRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("springmvc");

    @Override
    public Boolean save(PassportRegEntity passportRegEntity) {
        EntityManager entityManager = emf.createEntityManager();
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(passportRegEntity);
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
}
