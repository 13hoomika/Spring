package com.xworkz.donation.service;

import com.xworkz.donation.dto.DonationDto;
import com.xworkz.donation.entity.DonationEntity;

import java.util.List;

public interface DonationService {
    void validateAndSave(DonationDto dto);
    List<DonationDto> getAllDonations();
    void deleteDonationById(int id);
    DonationDto getDonationId(int id);
    void updateDonationDetails(DonationDto donationDto);
}
