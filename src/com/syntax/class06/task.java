package com.syntax.class06;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your country plz: ");
        String country = input.nextLine();

        String language = null;
        switch(country){
            case "usa":
                language="english";
                break;
            case "russia":
                language="russian";
                break;
            case "germany":
                language="deutsch";
                break;
            case "china":
                language="mandarine";
                break;
            default:
                language="uknown";
        }
        System.out.println("In"+country+" people speak "+language);
    }
}
