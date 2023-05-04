package com.ankitverma.springpractice.basicspringconfiguration;

public class Airtel implements Sim {

    @Override
    public void calling() {
        System.out.println("Calling from Airtel Sim.");

    }

    @Override
    public void data() {
        System.out.println("Using Data from Airtel Sim.");
    }
}
