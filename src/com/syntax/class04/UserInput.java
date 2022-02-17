package com.syntax.class04;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int num = 10;
        num = 30;

        Scanner input = new Scanner(System.in);
        // if you want to capture single string --> use next();

        System.out.println("You name Please: ");
        String name = input.next();
        System.out.println("Your name: "+name);

        System.out.println("Hi "+name+", Please enter your age: ");
        int age = input.nextInt();
        System.out.println(name+", you are "+age+" years old!");
    }
}
