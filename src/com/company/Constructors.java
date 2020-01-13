package com.company;

class Machine {

    private String name;
    private int code;

    public Machine(){

        System.out.println("Const running");

        name = "Arnie";
    }

    public Machine (String name){
        System.out.println("Second constructor");
        this.name = name;
    }

    public Machine(String name, int code){
        this.name = name ;
        this.code = code;
        System.out.println("Third constructor running");
    }


}

public class Constructors {

    public void constructors(){
        Machine machine1 = new Machine();

        Machine machine2 =new Machine("Mr T");
        Machine machine3 =new Machine("Mr T",9);
    }

}
