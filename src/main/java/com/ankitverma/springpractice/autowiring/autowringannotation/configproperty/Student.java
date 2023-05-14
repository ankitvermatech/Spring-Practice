package com.ankitverma.springpractice.autowiring.autowringannotation.configproperty;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    private String name;
    private String city;
    private String interestedCourse;

    @Value("${student1.name}")
    public void setName(String name) {
        this.name = name;
    }
    @Value("${student1.city}")
    public void setCity(String city) {
        this.city = city;
    }
    @Value("${student1.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }

    public void displayinfo(){
        System.out.println("I am "+ name +" from "+city +" interested in " + interestedCourse + " Course");
    }
}
