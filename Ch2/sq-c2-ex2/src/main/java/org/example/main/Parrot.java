package org.example.main;

public class Parrot {
    private String name;

    public Parrot(){
        this.name = "";
    }

    public Parrot(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
