package com.springpractice.javaconfiguration.college.config;

import com.springpractice.javaconfiguration.college.classes.BookDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.print.Book;

@Configuration
public class BookConfig {

    @Bean
    public BookDetails bookDetails(){
        BookDetails bookDetails = new BookDetails();
        return bookDetails;
    }
}
