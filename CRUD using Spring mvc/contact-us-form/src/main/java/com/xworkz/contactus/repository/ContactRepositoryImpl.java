package com.xworkz.contactus.repository;

import com.xworkz.contactus.entity.ContactEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

@Repository
public class ContactRepositoryImpl implements ContactRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("springmvc");
    @Override
    public Boolean save(ContactEntity entity) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if(em.getTransaction().isActive())
                em.getTransaction().rollback();
            return false;
        }finally {
            em.close();
        }
    }

    @Override
    public List<ContactEntity> getContactRequests() {
        try {
            EntityManager em = emf.createEntityManager();
            return em.createNamedQuery("getRequest",ContactEntity.class).getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Collections.emptyList();
    }

    @Override
    public boolean deleteData(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.createNamedQuery("deleteRecord").setParameter("id",id).executeUpdate();
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
    public ContactEntity getById(int id) {
        return (ContactEntity) emf.createEntityManager().createNamedQuery("getById").setParameter("id",id).getSingleResult();
    }

    @Override
    public Boolean update(ContactEntity entity) {
        EntityManager em = emf.createEntityManager();
        boolean isupdated = false;
        try {
            em.getTransaction().begin();
            ContactEntity ent = em.merge(entity);
            em.getTransaction().commit();
            if (ent != null){
                isupdated = true;
            }
            return isupdated;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            if (em.getTransaction().isActive()) em.getTransaction().rollback();
            return isupdated;
        } finally {
            em.close();
        }
    }
}
