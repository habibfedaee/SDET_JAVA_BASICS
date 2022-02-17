package com.syntax.class05;

import java.util.Scanner;

public class HW_Current_Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the current time: (24h format)");
        int hour = input.nextInt();

        if(hour>=1 && hour<=11){
            System.out.println("It is Morning!");
        } else if(hour>=12 && hour<=15){
            System.out.println("It is Afternoon!");
        } else if(hour>=16 && hour<=20){
            System.out.println("It is Evening!");
        } else if(hour>=21 && hour<=24){
            System.out.println("It is Night!");
        } else {
            System.out.println("Invalid time given!");
        }
    }
}
