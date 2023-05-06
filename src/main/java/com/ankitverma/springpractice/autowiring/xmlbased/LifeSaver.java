package com.ankitverma.springpractice.autowiring.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * byName - Autowire by name is checking name of Heart object and name in beans.xml if matching then autowiring is successful
 * byType - Autowire by Type is checking the type of object in beans.xml and Human class where dependency have to inject
 * Constructor - Autowire by constructor is using constructor for injecting the dependency
 *
 * from now on we don't have to write property and constructor-arg we just have to tell which autowire we want.
 */
public class LifeSaver {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/xmlbased/beans.xml");
        Human human = context.getBean("human", Human.class);
        human.startPumping();
    }
}
