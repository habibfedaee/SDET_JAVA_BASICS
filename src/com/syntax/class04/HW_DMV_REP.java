package com.syntax.class04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HW_DMV_REP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = 0;
        System.out.println("---------Welcome to CA DMV Driver License Department!------------");
        System.out.println("Please enter your age: ");
        age = input.nextInt();

        if(age >= 18){
            System.out.println("Great! you're eligible to apply for CA Driver License!");
        } else {
            System.out.println("Sorry! you can only apply for Learner's Permit right now!");
        }
    }
}
