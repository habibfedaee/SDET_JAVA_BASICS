package com.syntax.class09;

public class HW_Class09_Animals {
    public static void main(String[] args) {

        String[] animals = new String[5];
        animals[0]="Cat";
        animals[1]="Dog";
        animals[2]="Horse";
        animals[3]="Giraffe";
        animals[4]="Zebra";

        // Another way to create the animal array
        // String[] animals = {"Cat", "Dog", "Horse", "Giraffe", "Zebra};

        // classic for loop
        for(int i=0; i< animals.length; i++){
            System.out.print(animals[i]+" ");
        }
        System.out.println("\n---------------------------");
        // for each loop
        for(String animal:animals){
            System.out.print(animal+" ");
        }

    }
}
