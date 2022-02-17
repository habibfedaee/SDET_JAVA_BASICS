package com.syntax.class04;

import java.util.Scanner;

public class HW_LoanSpecialist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double loanRequestAmount = 0.0;
        double loanGrantedAmount = 0.0;
        boolean lended = false;
        boolean rejected = false;

        System.out.println("Dear Sir/Madam, Please enter the amount of loan you need?");
        System.out.println("Loan Amount: ");
        loanRequestAmount = input.nextDouble();

        if(loanRequestAmount<= 200000){
            lended = true;
            loanGrantedAmount = loanRequestAmount;
            System.out.println("Congrats! Your loan Amount of "+loanRequestAmount+" has been granted!");
        } else {
            rejected = true;
            System.out.println("Sorry! Your requested Amount is too High!");
            System.out.println("Your Loan Request Has been Rejected!");
        }
    }
}
