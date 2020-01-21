package com.company;

public class Plant {
    // Bad practice

    public String name;

    // Acceptable practice ----- its final.

    public final static int Id = 9;

    protected  String size;

    private String type;

    public Plant(){
        this.name = "Freddie";
        this.type = "plant";

        this.size = "large";
    }

}
