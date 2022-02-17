package com.syntax.class09;
import java.util.Scanner;
public class HW_Class09_Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Integers array
        int size = 5;
        int[] numbers = new int[size];
        // taking input
        System.out.println("Enter 5 whole numbers");
        for(int i=0; i<size; i++){
            System.out.print("Enter a number: ");
            numbers[i]=input.nextInt();
        }
        // printing array numbers
        int sum=0;
        for(int num: numbers){
            sum = sum+num;
            System.out.print(num+" ");
        }
        System.out.println("\nTotal: "+sum);
    }
}
