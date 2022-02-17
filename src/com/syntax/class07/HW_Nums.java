package com.syntax.class07;

public class HW_Nums {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Task 1: --------");
        // Task 1: Print number from 1 to 100 in single line using for loop
        for(int i=1; i<=100; i++){
            System.out.print(i+" ");
        }
        System.out.println("\nTask 2: --------");
        // Task 2: Print numbers from 100 to 1
        for(int j=100; j>=1; j--){
            System.out.print(j+" ");
        }
        System.out.println("\nTask 3: --------");
        // Task 3: Print even numbers from 20 to 1, in two ways
        for(int x=20; x>=1; x-=2){
            System.out.print(x+" ");
        }
        System.out.println();
        for(int x=20; x>=1; x--){
            if(x%2==0) {
                System.out.print(x + " ");
            }
        }
        System.out.println("\nTask 4: --------");
        // Task 4: Print odd numbers between 20 and 50 in two ways
        for(int y=21; y<=50; y+=2){
            System.out.print(y+" ");
        }
        System.out.println();
        for(int y =20; y<=50; y++){
            if(y%2!=0){
                System.out.print(y+" ");
            }
        }
    }
}
