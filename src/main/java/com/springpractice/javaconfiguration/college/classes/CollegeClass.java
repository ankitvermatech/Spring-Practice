package com.springpractice.javaconfiguration.college.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean")
public class CollegeClass {

    @Value("${Year}")
    private int year;
    @Value("${Student.Name}")
    private String studentName;

    @Value("${Professor.Name}")
    private String professorName;

    @Value("${Subject}")
    private String subject;

    @Autowired
    private Principal principal;

    @Autowired
    private Teacher teacher;


    public void display(){
        teacher.teacherInfo();
        principal.principalInfo();
        System.out.println("Student Name "+studentName +" Professor Name "+ professorName +" Subject "+ subject + " Year "+ year);
    }

}
