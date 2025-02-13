package com.xworkz.eSanjeevani.runner;

import com.xworkz.eSanjeevani.configuration.SpringConfiguration;
import com.xworkz.eSanjeevani.dto.PatientRecordDto;
import com.xworkz.eSanjeevani.service.PatientRecordService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValidateAndSaveRunner {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        PatientRecordService service = ac.getBean(PatientRecordService.class);

        PatientRecordDto dto = new PatientRecordDto();
        dto.setPatientName("Aruna");
        dto.setDiseaseHistory("headache & fever");
        dto.setPrescribedMedication("Dolo 625");

        service.ValidateAndSAve(dto);
    }
}
