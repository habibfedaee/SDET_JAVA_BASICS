package com.syntax.class08;

public class NestedLoop {
    public static void main(String[] args) {

        // car odometer:
//        System.out.println("a  b  c");
//        System.out.println("-------");
//        for(int a=0; a<=9; a++){
//            for(int b=0; b<=9; b++){
//                for(int c=0; c<=9; c++){
//                    System.out.println(a+"  "+b+"  "+c);
//                }
//            }
//        }
//
        // clock
        System.out.println("Clock:");
        for(int h=1; h<=12; h++){
            for(int m=0; m<60; m++){
                for(int s=0; s<60; s++){
                    System.out.println(h+":  "+m+":  "+s);
                }
            }
        }
    }
}
