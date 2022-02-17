package com.syntax.class03;

public class TemperatureCheck {
    public static void main(String[] args) {
        double temp = 30.0;
        if(temp <32.0){
            System.out.println("Water will freeze with temperature "+temp);
        } else {
            System.out.println("Water will not freeze!");
        }
    }
}
