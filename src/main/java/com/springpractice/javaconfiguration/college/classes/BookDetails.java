package com.springpractice.javaconfiguration.college.classes;

import org.springframework.beans.factory.annotation.Value;

public class BookDetails {

    @Value("Mahabharat")
    private String bookName;

    @Value("Mahrishi Vedvyas")
    private String author;

    private Principal principal;
//
//    public BookDetails(Principal principal) {
//        this.principal = principal;
//    }

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public void display(){
        System.out.println("Book "+bookName +" is written by "+ author);
        principal.principalInfo();
    }
}
