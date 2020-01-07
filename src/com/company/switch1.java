package com.company;

import java.util.Scanner;

public class switch1 {
    public static void switch1(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter some command: ");

        String text = input.nextLine();

        switch (text){

            case "start":
                System.out.println("Machine Started!");
                break;
            case "stop":
                System.out.println("Machine Stopped");
            default:
                System.out.println("Command not found!");
        }




    }

}
