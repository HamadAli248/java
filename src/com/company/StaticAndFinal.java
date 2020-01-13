package com.company;

class Thing {
    public final static int LUCKY_NUMBER = 8;



    public String name;
    public static String description;

    public static int count = 0;

    public int id;

    public Thing(){
        id = count;
        count++;
    }

    public void showName(){
        System.out.println("Object id is: "+id +":" +name);
    }
    public static void showIfo(){
        System.out.println(description);
    }
}


public class StaticAndFinal {

    public void staticAndFinal(){

        Thing.description = "I am A thing";
//        System.out.println(Thing.description);

        Thing.showIfo();

        System.out.println("Before connecting objects,count is: "+Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        System.out.println("After connecting objects,count is: "+Thing.count);

        thing1.name = "bob";
        thing2.name = "sfiong";

//        System.out.println(thing1.name);
//        System.out.println(thing2.name);

        thing1.showName();
        thing2.showName();


        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);

    }




}
