package com.company;

class Frog{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge ( int age){
        this.age = age;
    }

/*
  public void setName(String newName){
        name = newName;
    }

    public void setAge ( int newAge){
        age = newAge;
    }

 */

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}

public class SettersAndThis {
    public void settersAndTHis(){

        Frog frog1 = new Frog();

        frog1.setName("Allen");
        frog1.setAge(1);

    }
}
