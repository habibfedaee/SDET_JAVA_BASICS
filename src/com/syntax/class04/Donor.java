package com.syntax.class04;

public class Donor {
    public static void main(String[] args) {
        boolean eligible = false;
        int age = 19;

        if (age > 18) {
            int weight = 220;
            if (weight > 110) {
                eligible = true;
                System.out.println("Eligible to donate blood!");
            } else {
                System.out.println("You don't have that much blood to donate!");
            }
        } else {
            System.out.println("You're not old enough!");
        }
    }
}
