package com.syntax.class04;
import java.util.Scanner;

public class HW_CreditChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer = "";
        double creditBalance = 0.0;

        System.out.println("Dear Sir/Madam, Do you own a Credit Card?");
        System.out.println(" (Y/N): ");
        answer = input.next();

        if(answer.equals("Y")){
            System.out.println("Please enter the balance of your credit Card: ");
            creditBalance = input.nextDouble();
            if(creditBalance>1000){
                System.out.println("Please pay off the balance of your credit immediately!");
            } else {
                System.out.println("Great, You can spend more out of your credits! ");
            }
        } else if(answer.equals("N")){
            System.out.println("You're mostly welcome to apply for our credit card!");
        } else {
            System.out.println("Sorry, Wrong Answer!");
        }
    }
}
