
package com.syntax.class02;

import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {
        double n1, n2;
        double result;
        System.out.println("------------------------Part 1----------------------");
        n1 = 21;
        n2 = 2;
        result = n1 + n2;
        String action = "Sum";
        System.out.println("The " + action + " of two numbers " + n1 + " and " + n2 + " is equal to " + result);
        action = "minus";
        result = n1 - n2;
        System.out.println("The " + action + " of two numbers " + n1 + " and " + n2 + " is equal to " + result);
        action = "division";
        result = n1 / n2;
        System.out.println("The " + action + " of two numbers " + n1 + " and " + n2 + " is equal to " + result);
        action = "multiplication";
        result = n1 * n2;
        System.out.println("The " + action + " of two numbers " + n1 + " and " + n2 + " is equal to " + result);

        System.out.println("------------------------Part 2----------------------");
        float number = 3.9f;
        float square = number * number;
        System.out.println("The Square of the " + number + " is " + square);

        System.out.println("------------------------Part 3----------------------");
        int width = 5;
        int height = 8;
        // P=2l+2w
        int perimeter = 2*(width+height);
        // A=lw
        int area =height*width;
        System.out.println("The perimeter of a rectangle with width of "+width+" and height of "+height+" is equal to "+perimeter);
        System.out.println("The area of a rectangle with width of "+width+" and height of "+height+" is equal to "+area);
    }
}
