package com.company;

class Person{

   // Instance variables (data or "state")

    String name;
    int age;

    //Classes can contain

    //1. Data
    //2. Subroutines(methods)
    void speak(){
        for (int i = 0; i<3;i++){
            System.out.println("Hello");
        }
    }

    void sayHello(){
        System.out.println("Hello There!!!");

    }


}

public class ClassesAndObjects {
    public void  classesAndObjects(){

        Person person1 = new Person();
        person1.name = "Hamad Ali";
        person1.age = 19;
        person1.speak();
        person1.sayHello();

        Person person2 = new Person();
        person2.name= "Bob dj";
        person2.age= 33;

        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println();
        System.out.println(person2.name);
        System.out.println(person2.age);


    }
}
