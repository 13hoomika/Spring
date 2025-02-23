package com.xworkz.donation.repository;

import com.xworkz.donation.entity.DonationEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Collections;
import java.util.List;

@Repository
public class DonationRepositoryImpl implements DonationRepository{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("springmvc");
    @Override
    public Boolean save(DonationEntity entity) {
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
            return  false;
        }finally {
            em.close();
        }
    }

    @Override
    public List<DonationEntity> getAllDonations() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery("getAllQuery", DonationEntity.class).getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    @Override
    public void deleteDonationById(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.createNamedQuery("deleteQuery").setParameter("dId",id).executeUpdate();
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            em.close();
        }

    }

    @Override
    public DonationEntity getDonationId(int id) {
        return ((DonationEntity) emf.createEntityManager().createNamedQuery("getIdQuery").setParameter("dId",id).getSingleResult());
    }

    @Override
    public Boolean updateDonationDetails(DonationEntity donationEntity) {
        EntityManager em = emf.createEntityManager();
        boolean isUpdated = false;
        try {
            em.getTransaction().begin();
            DonationEntity mergeEntity = em.merge(donationEntity);
            em.getTransaction().commit();
            if (mergeEntity != null) isUpdated= true;
            return isUpdated;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return isUpdated;
        } finally {
            em.close();
        }
    }
}
