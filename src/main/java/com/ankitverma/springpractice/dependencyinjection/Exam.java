package com.ankitverma.springpractice.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependencyinjection/beans.xml");
        Student student1 = context.getBean("student1", Student.class);
        student1.displayStudenInfo();

    }
}
