package com.ankitverma.springpractice.dependencyinjection.injectingobjects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

    /**
     *
     * In beans file if we are using property then we are injecting using setter injection
     * but if we are using constructor-arg then we are using constructor injection
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependencyinjection/injectingobjects/beans.xml");
        Student student1 = context.getBean("student", Student.class);
        student1.startCheating();
    }
}
