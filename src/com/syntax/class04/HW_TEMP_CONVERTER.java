package com.syntax.class04;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HW_TEMP_CONVERTER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celcius = 0.0;
        double fahrenheit = 0.0;
        // celcius to fahrenheit formula: (0°C × 9/5) + 32 = 32°F
        // fahrenheit to celcius formula: (0°F − 32) × 5/9 = -17.78°C

        String city = "";
        double temp = 0.0;
        System.out.println("Please enter city name: ");
        city = input.nextLine();
        System.out.println("Please enter the "+city+"'s temperature (Fahrenheit): ");
        temp = input.nextDouble();
        fahrenheit= temp;
        celcius = (fahrenheit - 32) * 5/9;
        System.out.println("The temperature in the city of "+city+" is "+celcius+" celcius!");
    }
}
