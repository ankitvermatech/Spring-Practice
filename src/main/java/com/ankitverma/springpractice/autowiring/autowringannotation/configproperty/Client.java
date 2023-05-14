package com.ankitverma.springpractice.autowiring.autowringannotation.configproperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/configproperty/beans.xml");
        Student student = context.getBean("student1", Student.class);
        student.displayinfo();
    }
}
