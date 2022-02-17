package com.syntax.class04;

public class NestedIf {
    public static void main(String[] args) {
//        boolean vaccinated = false;
//        boolean fullyVaccinated = false;
//        int doseTaken = 1;
//        if(doseTaken == 1){
//            vaccinated=true;
//            System.out.println("The did you also take the second shot?");
//            if(doseTaken==2){
//                fullyVaccinated=true;
//                System.out.println("Great! you are fully vaccinated!");
//            }
//        } else {
//            System.out.println("Get the vaccine please or you're gonna d**!");
//        }

        boolean haveDiploma = true;
        double gpaScore = 3.6;
        if(haveDiploma){
            System.out.println("Congratulations! ");
            if(gpaScore >= 3.5){
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should studied harder!");
            }
        } else {
            System.out.println("You need to get a CS Degree!");
        }

    }

}
