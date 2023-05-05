package com.ankitverma.springpractice.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

    /**
     * This is the dependency Injection using Setter Injection in Spring
     * In this we are injecting literals
     *
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/beans.xml");
        Student student1 = context.getBean("student1", Student.class);
        student1.displayStudenInfo();

        Student student2 = context.getBean("student2", Student.class);
        student2.displayStudenInfo();

    }
}
