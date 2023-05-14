package com.ankitverma.springpractice.autowiring.autowringannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *If I don't want to give values to my class then only @Autowired is perfect
 * but if you want to give values to your beans then you require @Qualifier
 * and if you want to tell which is required or not the use @Required
 */
public class Academy {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("firstspringcoreproject/firstcorespringmvc/beans.xml");
        Batch batch = context.getBean("batch",Batch.class);
        batch.batchApplicantDetails();
    }


}
