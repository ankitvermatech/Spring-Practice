package com.ankitverma.springpractice.basicspringconfiguration;

public class Jio implements Sim{
    @Override
    public void calling() {
        System.out.println("Calling from Jio Sim.");
    }

    @Override
    public void data() {
        System.out.println("Using data from Jio Sim.");

    }
}
