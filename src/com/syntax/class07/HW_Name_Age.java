package com.syntax.class07;
import java.util.Scanner;

public class HW_Name_Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int i=1; i<=5; i++){
            System.out.println("Please enter your first name:");
            String fname = input.nextLine();
            System.out.println("Please enter your last name: ");
            String lname = input.nextLine();
            System.out.println("Please enter your age: ");
            int age = input.nextInt();
            System.out.println("Your name is "+fname+" "+lname+" and you are "+age+" years old");
            input.nextLine();
        }
    }
}
