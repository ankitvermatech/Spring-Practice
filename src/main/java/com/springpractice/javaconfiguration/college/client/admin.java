package com.springpractice.javaconfiguration.college.client;

import com.springpractice.javaconfiguration.college.classes.BookDetails;
import com.springpractice.javaconfiguration.college.classes.CollegeClass;
import com.springpractice.javaconfiguration.college.config.BookConfig;
import com.springpractice.javaconfiguration.college.config.CollegeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class admin {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
        CollegeClass college =  context.getBean("collegeBean", CollegeClass.class);
        college.display();
        context.close();

//        ApplicationContext context = new AnnotationConfigApplicationContext(BookConfig.class);
//        BookDetails book = context.getBean("bookDetails", BookDetails.class);
//        book.display();
    }
}
