package com.syntax.class08;
import java.util.Scanner;

public class HW_CreditCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans = "";
        while(!ans.equalsIgnoreCase("yes")){
            System.out.println("Do you want to apply for the credit card? (Yes/No)");
            ans = input.nextLine();
        }

    }
}
