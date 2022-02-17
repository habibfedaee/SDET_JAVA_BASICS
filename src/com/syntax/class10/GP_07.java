package com.syntax.class10;

public class GP_07 {
    public static void main(String[] args) {
        // 7. Write a program to print the first 10 numbers of Fibonacci series

        // The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
        // The next number is found by adding up the two numbers before it:.

        int[] fibonacci = new int[12];
        fibonacci[0]=0; fibonacci[1]=1;
        for(int i=0; i<=fibonacci.length; i++){
            fibonacci[i+2] = fibonacci[i]+fibonacci[i+1];
            System.out.print(fibonacci[i]+" ");
//            if (fibonacci[i+2]<45) {
//                break;
//            }
        }
    }
}
