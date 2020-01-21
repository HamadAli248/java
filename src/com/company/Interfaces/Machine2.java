package com.company.Interfaces;

public class Machine2 implements Interfaceinfo{
    private int id = 7;

    public void start(){
        System.out.println("Machine started");
    }


    @Override
    public void showInfo() {
        System.out.println("Machine id is "+ id);

    }
}
