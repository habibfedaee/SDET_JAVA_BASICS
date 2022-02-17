package com.syntax.class07;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        // task1: print numbers 1 - 100 in 1 line with space:
        System.out.println("---------------------------Task 1 --------------------------");
        int num1 = 1;
        while (num1<=100){
            System.out.print(num1+" ");
            num1++;
        }
        System.out.println("\n---------------------------Task 2 --------------------------");
        // task2: print numbers from 100 - 1
        int num2 = 100;
        while (num2 >=1){
            System.out.print(num2+" ");
            num2--;
        }
        System.out.println("\n---------------------------Task 3 --------------------------");
        // task3: print even numbers from 20 - 100
        int num3 = 20;
        while(num3<=100){
            System.out.print(num3+" ");
            num3+=2;
        }
        System.out.println("\n---------------------------Task 4 --------------------------");
        // task4: print only odd numbers from 100 - 1
        int num4 = 99;
        while(num4>=1){
            System.out.print(num4+" ");
            num4-=2;
        }
    }

}