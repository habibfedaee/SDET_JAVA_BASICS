package com.syntax.class06;
import java.util.Scanner;
public class HW_Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a grade");
        char grade = input.next().charAt(0);

        if(grade=='A'){
            System.out.println("A - Excellent");
        } else if(grade=='B'){
            System.out.println("B - Good");
        } else if(grade=='C'){
            System.out.println("C - Average");
        } else if(grade=='D'){
            System.out.println("D - Bad");
        } else {
            System.out.println("Not Acceptable");
        }
    }
}
