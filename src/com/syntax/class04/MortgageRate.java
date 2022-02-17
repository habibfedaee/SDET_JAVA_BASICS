package com.syntax.class04;

import java.sql.SQLOutput;

public class MortgageRate {
    public static void main(String[] args) {

        double mortgageRate, mortgagePrice;
        mortgageRate = 1.2;
        mortgagePrice = 232323.0;

        if(mortgageRate > 4.5){
            System.out.println("I am not going to buy a House right now!");
        } else {
            System.out.println("Proper time to buy a house!");
            if(mortgagePrice> 50000){
                System.out.println("I need to take a loan from Somewhere!");
            } else {
                System.out.println("Does not cost bank breaking amount!");
            }
        }

    }
}
