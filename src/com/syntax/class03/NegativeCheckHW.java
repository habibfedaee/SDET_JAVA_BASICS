package com.syntax.class03;

public class NegativeCheckHW {
    public static void main(String[] args) {
        int num = -9;
        if(num<0){
            System.out.println("The number "+num+" is negative!");
        } else if(num>0){
            System.out.println("The number "+num+" is positive!");
        } else {
            System.out.println("The number "+num+" is incorrect of type!");
        }
    }
}
