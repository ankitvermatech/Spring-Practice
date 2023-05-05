package com.ankitverma.springpractice.dependencyinjection;

public class Student {

    private Student(){

    }
    public Student(int id, String name) {
        System.out.println("id : "+ id + " is using Constructor injection");
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public void setId(int id) {
        System.out.println("id : "+ id + " is using Constructor injection");
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayStudenInfo(){
        System.out.println("Student name is : "+ name + " with Id : " + id);
    }
}
