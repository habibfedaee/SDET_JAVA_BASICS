package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What day is today?");
        String day = input.nextLine();

        if(day.equals("monday") || day.equals("friday")) {
            System.out.println("there is no class today");
        } else if(day.equals("tuesday") || day.equals("wednesday")){
            System.out.println("manual");
        } else if(day.equals("thursday")){
            System.out.println("review class");
        } else if(day.equals("saturday") || day.equals("sunday")){
            System.out.println("java class");
        } else {
            System.out.println("wrong input!");
        }
    }
}
