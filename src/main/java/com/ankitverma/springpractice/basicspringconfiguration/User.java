package com.ankitverma.springpractice.basicspringconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

    /**
     *
     * This is the first and basic implementation of Spring using xml and Interface
     * in this we can specify many dependencies in beans.xml and call here using there class
     * This is how Spring helps us to work in managing and creating objects and helping
     * our application to be configurable by managing dependencies.
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("basicconfiguration/beans.xml");
        System.out.println("Beans loaded successfully");

        Sim sim1 = context.getBean("airtel",Sim.class);
        sim1.calling();
        sim1.data();

        Sim sim2 = context.getBean("jio",Sim.class);
        sim2.calling();
        sim2.data();
    }

}
