package com.ankitverma.springpractice.autowiring.autowringannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Batch {

    @Autowired
    @Qualifier("applicant1")
    private Applicant applicant;

    public void batchApplicantDetails(){
        applicant.present();
        System.out.println("Applicant "+applicant.getName() +" is in this batch from " +applicant.getCity());
    }
}
