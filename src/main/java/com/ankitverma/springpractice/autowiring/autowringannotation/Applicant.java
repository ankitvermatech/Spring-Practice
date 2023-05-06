package com.ankitverma.springpractice.autowiring.autowringannotation;

public class Applicant {

    String name;
    String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void present(){
        System.out.println("Applicant is present.");
    }

}
