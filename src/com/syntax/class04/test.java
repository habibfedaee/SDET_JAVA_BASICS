package com.syntax.class04;

import java.util.Scanner;

public class test{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter temp:");
        int temp = input.nextInt();
        System.out.println(temp);

        input.nextLine(); // in order to keep prog running, cause input.nextInt() skips to end

        System.out.println("please enter city");
        String city = input.nextLine();
        System.out.println(city);

        System.out.println("end of program");
    }
}