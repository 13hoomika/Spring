package com.xworkz.login.repository;

import com.xworkz.login.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@Repository
public class UserRepositoryImpl implements UserRepository{
    @Override
    public Boolean save(UserEntity userEntity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("springmvc");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(userEntity);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if(em.getTransaction().isActive())
                em.getTransaction().rollback();
            return  false;
        }finally {
            em.close();
        }

    }
}
