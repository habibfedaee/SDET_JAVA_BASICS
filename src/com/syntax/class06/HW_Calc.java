package com.syntax.class06;
import java.util.Scanner;
public class HW_Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Please enter an operator: (+, -, *, /");
        char operator = input.next().charAt(0);
        double result = 0.0;
        switch(operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                if(num2!=0) {
                    result = num1 * num2;
                } else {
                    result = 0;
                    System.out.println("cannot multiply to zero!");
                }
                break;
            case '/':
                if(num2!=0) {
                    result = num1 / num2;
                } else {
                    result = 0;
                    System.out.println("cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid Operator!");
        }
        System.out.println("Result: "+result);
    }
}
