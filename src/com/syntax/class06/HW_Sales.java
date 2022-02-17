package com.syntax.class06;

import java.util.Scanner;

public class HW_Sales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Customer: is there Sale going on? (true/false)");
        boolean onSale = input.nextBoolean();
        int discount =0;
        int price =0;

        if(!onSale){
            discount=0;
            System.out.println("Owner: no sale!");
            System.out.println("Customer: Sorry not going to buy!");
        }else if(onSale){
            System.out.println("Owner: Yes");
            System.out.println("Owner: What is the price of the item");
            price = input.nextInt();
            if(price < 20){
                discount = 10;
            } else if(price>=20 && price <100){
                discount=20;
            } else if(price>=100 && price <= 500){
                discount=30;
            } else {
                discount=50;
            }
            int saving = (price*discount)/100;
            int finalPrice = price-saving;
            System.out.println("Owner: After "+discount+"% discount, Final Price: "+finalPrice);
            System.out.println("Customer: Thank you!");
        }
    }
}
