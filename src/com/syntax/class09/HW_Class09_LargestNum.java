package com.syntax.class09;

import java.util.Scanner;

public class HW_Class09_LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Task: Find largest Num in Array");
        int size = 3;
        int[] numbers = new int[size];
        // taking input
        for(int i=0; i<size; i++){
            System.out.print("Enter a number: ");
            numbers[i]=input.nextInt();
        }
        // finding largest
        int largest = numbers[0];
        for(int x=1; x< numbers.length; x++){
            if(numbers[x]>largest){
                largest = numbers[x];
            }
        }
        for(int num: numbers){
            if(num>largest){
                largest = num;
            }
        }
        System.out.println("largest: "+largest);
    }
}
