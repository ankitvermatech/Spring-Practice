package com.ankitverma.springpractice.autowiring.autowringannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Batch {

    private Applicant applicant;

    @Autowired
    public Batch(Applicant applicant) {
        this.applicant = applicant;
        System.out.println("Batch constructor being called ");
    }


    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
        System.out.println("Setter method called");
    }

    public void batchApplicantDetails(){
        applicant.present();
        System.out.println("Applicant is in this batch!");
    }
}
