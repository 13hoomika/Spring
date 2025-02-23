package com.xworkz.donation.service;

import com.sun.org.apache.bcel.internal.generic.LDIV;
import com.xworkz.donation.dto.DonationDto;
import com.xworkz.donation.entity.DonationEntity;
import com.xworkz.donation.repository.DonationRepository;
import com.xworkz.donation.repository.DonationRepositoryImpl;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
@Service
public class DonationServiceImpl implements DonationService{
    @Autowired
    DonationRepository repository;

    @Override
    public void validateAndSave(DonationDto dto) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<DonationDto>> validate = validator.validate(dto);
        if (validate.isEmpty()){
            DonationEntity entity = new DonationEntity();
            try {
                BeanUtils.copyProperties(entity,dto);
                repository.save(entity);
                System.out.println(entity);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }else validate.stream().forEach(err -> System.out.println(err.getMessage()));

    }

    @Override
    public List<DonationDto> getAllDonations() {
        List<DonationEntity> donationEntityList = repository.getAllDonations();
        List<DonationDto> donationDtoList = new ArrayList<>();
        if (donationEntityList != null){
            for (DonationEntity entity: donationEntityList){
                DonationDto dto = new DonationDto();
                dto.setDonationId(entity.getDonationId());
                dto.setName(entity.getName());
                dto.setEmail(entity.getEmail());
                dto.setDonationType(entity.getDonationType());
                dto.setAmount(entity.getAmount());
                dto.setMessage(entity.getMessage());

                donationDtoList.add(dto);

            }
        }
        return donationDtoList;
    }

    @Override
    public void deleteDonationById(int id) {

        if (repository != null){
            repository.deleteDonationById(id);
            System.out.println("donation "+ id +" deleted");
        }
    }

    @Override
    public DonationDto getDonationId(int id) {
        DonationDto dto = new DonationDto();
        if (id >0){
            DonationEntity donationEntity = repository.getDonationId(id);
            try {
                BeanUtils.copyProperties(dto,donationEntity);
            } catch (IllegalAccessException |InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return dto;
    }

    @Override
    public void updateDonationDetails(DonationDto donationDto) {
        DonationEntity entity = new DonationEntity();
        try {
            BeanUtils.copyProperties(entity,donationDto);
            repository.updateDonationDetails(entity);
//            Boolean updated = repository.updateDonationDetails(entity);
//            if (updated){
//                System.out.println("updated");
//                return true;
//            }else System.out.println("not updated");
        } catch (IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }
//        return false;
    }
}
