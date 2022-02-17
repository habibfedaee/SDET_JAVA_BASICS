package com.syntax.class05;

import java.util.Scanner;

public class HW_Birth_Season {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter you birth month:");
        String month = input.nextLine();

        if(month.equals("march") || month.equals("april") || month.equals("may")){
            System.out.println("You were born in Spring!");
        } else if(month.equals("june") || month.equals("july") || month.equals("august")){
            System.out.println("You were born in Summer!");
        } else if(month.equals("september") || month.equals("october") || month.equals("november")){
            System.out.println("You were born in Fall!");
        } else if(month.equals("december") || month.equals("january") || month.equals("february")){
            System.out.println("You were born in Winter!");
        } else {
            System.out.println("Invalid month value!");
        }
    }
}
