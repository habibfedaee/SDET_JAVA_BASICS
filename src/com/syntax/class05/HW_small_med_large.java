package com.syntax.class05;

import java.util.Scanner;

public class HW_small_med_large {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num = input.nextInt();

        if(num>=1 && num<=10){
            System.out.println("Number you entered is small!");
        } else if(num>=11 & num<=100){
            System.out.println("Number you entered is medium!");
        } else if(num>=101 & num<=1000){
            System.out.println("Number you entered is large!");
        }
    }
}
