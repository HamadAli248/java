package com.company.Interfaces;

public class Machine2Person implements Interfaceinfo{
    private String name;

    public Machine2Person(String name) {
            this.name = name;
    }

    public void greet(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + name);
    }
}
