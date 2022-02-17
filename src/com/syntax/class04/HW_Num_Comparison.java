package com.syntax.class04;

import java.util.Scanner;

public class HW_Num_Comparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 3 diff numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if(num1>num2){
            if(num1>num3){
                // num1 largest
                System.out.println(num1+" is the largest");
            } else {
                // num3 is largest
                System.out.println(num3+" is the largest");
            }
        } else  {
            if(num2>num3){
                // num2 is largest
                System.out.println(num2+" is the largest");
            } else {
                // num3 is the largest
                System.out.println(num3+" is the largest");
            }
        }

    }
}
