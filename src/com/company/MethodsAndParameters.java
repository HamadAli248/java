package com.company;


class Robot{
    public void robotSpeak(String text){
        System.out.println(text);
    }
    public void jump (int height){
        System.out.println("Jumping: "+ height);
    }

    public void move(String direction, double distance){
        System.out.println("Moving " + distance + " metres in direction "+direction);
    }

}


public class MethodsAndParameters {
    public void myRobot(){
        Robot jack = new Robot();
        jack.robotSpeak("Hi I`m Jack the robot");
        jack.jump(9);

        jack.move("north",80);

        String greeting = "Hello there";

        jack.robotSpeak(greeting);

    }

}
