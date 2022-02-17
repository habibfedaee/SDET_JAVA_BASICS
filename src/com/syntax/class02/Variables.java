package com.syntax.class02;

public class Variables {
    public static void main(String[] args) {
        // Variables:
        //A:
        String name, lastName, grade, city, state, phoneNumber;
        name = "Habib";
        lastName= "Fedaee";
        grade = "A";
        city = "Sac";
        state = "CA";
        phoneNumber= "123-332-2222";
        System.out.println("My name is "+name+" and my last name is "+lastName);
        System.out.println("I am "+grade+" student");
        System.out.println("I live in city of "+city+ " and state of "+state);
        System.out.println("And my phone number is "+phoneNumber);

        //B:
        city="SF";
        state = "CA";
        phoneNumber="222-333-4555";
        grade="B";
        System.out.println("My name is "+name+" and I moved to new city "+city+" and new state "+state+".");
        System.out.println("My new phone number is "+phoneNumber);
    }
}
