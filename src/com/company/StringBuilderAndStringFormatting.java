package com.company;

public class StringBuilderAndStringFormatting {
    public static void stringBuilderAndStringFormatting() {

        // Inefficient
//
//        String info = "";
//        info += "My name is Bob";
//        info += " ";
//        info += "I am A builder";
//
//        System.out.println(info);

        //More efficient

        StringBuilder sb = new StringBuilder("");

        sb.append("my name is sue .");
        sb.append("   ");
        sb.append("I am a developer");

        System.out.println(sb.toString());

        //////////////// Formatting ////////////////////////////

        System.out.println("Here is some Text. \t That was a tab. \n That was a new line. ");



    }

}
