package com.syntax.class10;

public class test {
    public static void main(String[] args) {

//        // create an array and retrieve all elements in reverse order
//        System.out.println("Printing array numbers (0-9) in reverse:");
//        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for(int i=numbers.length-1; i>=0; i--){
//            System.out.print(numbers[i]+" ");
//        }

        // Create an array of countries. while retrieving all values from an array print
        // capital for each country.
//        String[] countries = {"USA", "Russia", "Afghanistan", "Turkey", "Korea", "Austria"};
//        String[] capitals = {"Washington DC", "Moscow", "Kabul", "Istanbul", "Soel", "Vienna"};
//
//        for(int i=0; i< countries.length; i++){
//            System.out.print("Country: "+countries[i]+" ,\t");
//            for(int j=0; j< capitals.length; j++){
//
//                if(i==j){
//                    System.out.println("Capital: "+capitals[j]);
//                }
//            }
//        }

        // Task 1
        String[][] names = new String[2][4];
        names[0][0]="Mr.";
        names[0][1]="Mrs.";
        names[0][2]="Ms.";
        names[0][3]="Miss";
        names[1][0]="Smith";
        names[1][1]="Jordan";
        names[1][2]="Jackson";
        names[1][3]="Obama";
        // print Mrs Smith, Mr. Obama, Ms Jackson, Miss Jordan
        System.out.println("---Titles & Names-----");
        System.out.println(names[0][1]+" "+names[1][0]);
        System.out.println(names[0][0]+" "+names[1][3]);
        System.out.println(names[0][2]+" "+names[1][2]);
        System.out.println(names[0][3]+" "+names[1][1]);

        // Task 2
        System.out.println("------Grades-------");
        String[][] students = {{"Ali", "Tawab", "Joe", "Mary"}, {"A", "B", "C", "D"}};
        System.out.println(students[0][0]+" has "+students[1][0]+" grade");
        System.out.println(students[0][1]+" has "+students[1][1]+" grade");








    }

}
