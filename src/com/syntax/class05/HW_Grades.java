package com.syntax.class05;

import java.util.Scanner;

public class HW_Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first quiz score:");
        int quiz_score = input.nextInt();
        System.out.println("Please enter mid-term quiz score:");
        int mid_term_score = input.nextInt();
        System.out.println("Please enter final quiz score:");
        int final_score = input.nextInt();

        int avg_score = (quiz_score + mid_term_score + final_score) / 3;
        if(avg_score >= 90){
            System.out.println("Grade = A");
        } else if(avg_score >= 70 && avg_score < 90){
            System.out.println("Grade = B");
        } else if(avg_score >= 50 && avg_score < 70){
            System.out.println("Grade = C");
        } else if(avg_score < 50){
            System.out.println("Grade = F");
        } else {
            System.out.println("Invalid score!");
        }
    }
}
