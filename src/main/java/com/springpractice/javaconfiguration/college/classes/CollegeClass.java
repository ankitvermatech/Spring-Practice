package com.springpractice.javaconfiguration.college.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class CollegeClass {

    @Value("2019")
    private int year;
    @Value("Ankit")
    private String studentName;

    @Value("Bipin Rai")
    private String professorName;

    @Value("DSA")
    private String subject;


    public void display(){
        System.out.println("Student Name "+studentName +" Professor Name "+ professorName +" Subject "+ subject + " Year "+ year);
    }

}
