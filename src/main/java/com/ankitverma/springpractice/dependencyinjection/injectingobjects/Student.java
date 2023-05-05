package com.ankitverma.springpractice.dependencyinjection.injectingobjects;

public class Student {

    private MathCheat cheat;
    private String name;

    public void setCheat(MathCheat cheat) {
        this.cheat = cheat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void startCheating(){
        cheat.mathCheat();
    }
}
