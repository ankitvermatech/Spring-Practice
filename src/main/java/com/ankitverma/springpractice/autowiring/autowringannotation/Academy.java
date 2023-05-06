package com.ankitverma.springpractice.autowiring.autowringannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Academy {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/beans.xml");
        Batch batch = context.getBean("batch",Batch.class);
        batch.batchApplicantDetails();
    }


}
