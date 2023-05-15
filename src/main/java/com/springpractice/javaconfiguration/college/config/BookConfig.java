package com.springpractice.javaconfiguration.college.config;

import com.springpractice.javaconfiguration.college.classes.BookDetails;
import com.springpractice.javaconfiguration.college.classes.Principal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.print.Book;

@Configuration
public class BookConfig {


//    @Bean
//    public Principal principal(){
//        return new Principal();
//    }

//    @Bean
//    public BookDetails bookDetails(){
//        BookDetails bookDetails = new BookDetails();
////        BookDetails bookDetails = new BookDetails(principal()); // Constructor Injection
//        bookDetails.setPrincipal(principal()); // Setter Injection
//        return bookDetails;
//    }
}
