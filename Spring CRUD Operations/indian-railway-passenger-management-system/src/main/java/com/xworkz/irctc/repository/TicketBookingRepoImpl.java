package com.xworkz.irctc.repository;

import com.xworkz.irctc.entity.TicketBookingEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class TicketBookingRepoImpl implements TicketBookingRepository {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");

    @Override
    public boolean save(TicketBookingEntity entity) {
        EntityManager em = emf.createEntityManager();
        boolean isSaved = false;
        try {
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            isSaved = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
        return isSaved;
    }
}
