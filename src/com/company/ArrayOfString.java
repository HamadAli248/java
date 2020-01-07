package com.company;

public class ArrayOfString {
    public void ArrayOfStrings(){
    String[] words = new String[3];

    words[0] = "hello";
    words[1] = "!";
    words[2] = "Welcome";

    System.out.println(words[1]);

    String[] fruits = {"orange","banana","apple"};

    for(String fruit: fruits){
        System.out.println(fruit);
    }


    }
}
