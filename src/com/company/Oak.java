package com.company;

public class Oak extends  Plant{
    public Oak(){

        // wont work --- type is private
        // type = "tree";

        // this works because size is protected ,Oak is a subclass of plant.
        this.size = "small";


    }
}
