package com.syntax.class09;

public class HW_Class09_Cars {
    public static void main(String[] args) {
        // Create an array of cars and store 6 elements into it.
        // Using 2 different loops print all values from the array.

        String[] cars = {"Audi", "BMW", "Hunda", "Ford", "Kia", "Lexus"};
        // For Classic
        for(int i=0; i< cars.length; i++){
            System.out.print(cars[i]+" ");
        }
        // For Each
        System.out.println("\n--------------------------");
        for(String car: cars){
            System.out.print(car+" ");
        }
    }
}
