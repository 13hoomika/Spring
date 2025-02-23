package com.xworkz.helthcareapp.repo;

import com.xworkz.helthcareapp.entity.PatientEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@Repository
public class PatientRepositoryImpl implements PatientRepository{
    @Override
    public Boolean save(PatientEntity patientEntity) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("springmvc");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(patientEntity);
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
