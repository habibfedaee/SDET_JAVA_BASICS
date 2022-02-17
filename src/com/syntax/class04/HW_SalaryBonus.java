package com.syntax.class04;
import java.util.Scanner;
public class HW_SalaryBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int yearsWorked; int annualSalary = 0; int bonusPay;
        boolean eligible = false;
        System.out.println("Name Please: ");
        String name = input.next();
        System.out.println("Hi "+name+", How many years you've worked with us?");
        System.out.println("Years: ");
        yearsWorked = input.nextInt();

        if(yearsWorked >= 5){
            eligible = true;
            System.out.println("Your Annual Salary Amount: ");
            annualSalary = input.nextInt();
            if(annualSalary >= 50000){
                bonusPay = 5000;
                System.out.println("You're doing Great, You are getting "+bonusPay+" bonus pay along with your salary!");
            } else {
                bonusPay = 3000;
                System.out.println("Keep up working, right now your bonus pay is: "+bonusPay+"!");
            }
        } else {
            System.out.println("Sorry, You're not eligible for bonus pay!");
            eligible=false;
        }
    }
}
