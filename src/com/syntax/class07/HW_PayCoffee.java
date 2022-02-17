package com.syntax.class07;
import java.util.Scanner;
public class HW_PayCoffee {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int coffeePrice = 5;
        int paidAmount = 0;
        do{
            System.out.println("Please pay for the coffee");
            paidAmount = input.nextInt();
            if(paidAmount>coffeePrice){
                System.out.println("Please enter lower amount");
            } else if( paidAmount<coffeePrice){
                System.out.println("Please enter higher amount");
            }
        } while(paidAmount!=coffeePrice);
        System.out.println("Please enjoy your candy!");
    }

}
