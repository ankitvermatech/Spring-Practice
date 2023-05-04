package com.ankitverma.springpractice.dependencyinjection;

public class Student {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayStudenInfo(){
        System.out.println("Student name is : "+ name + " with Id : " + id);
    }
}
