package com.xworkz.donation.repository;

import com.xworkz.donation.entity.DonationEntity;

import java.util.List;

public interface DonationRepository {
    Boolean save(DonationEntity entity);
    List<DonationEntity> getAllDonations();
    void deleteDonationById(int id);
    DonationEntity getDonationId(int id);
    Boolean updateDonationDetails(DonationEntity donationEntity);


}
