package com.xworkz.eSanjeevani.repository;

import com.xworkz.eSanjeevani.entity.PatientRecordEntity;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Component
public class PatientRecordRepoImpl implements PatientRecordRepository {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("bcp");

    @Override
    public Boolean save(PatientRecordEntity entity) {
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
