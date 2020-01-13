package com.company;

class Snake {

    private int id;
    private String name;

    public Snake(int id , String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id + " : " + name;
    }

        }

public class TheToStringMethod {
    public static void theToStringMethod() {

      Snake snake1 = new Snake(1,"adbds");

    }
}
