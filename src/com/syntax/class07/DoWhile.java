package com.syntax.class07;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int guess = 0;
        int secretNum = 7;
        System.out.println("I have a secret number to guess!");
        do{
            System.out.println("Plz enter your guess number: ");
            guess = input.nextInt();
        } while(secretNum!=guess);
        System.out.println("Congrats! my secret number was: "+guess);
    }
}
