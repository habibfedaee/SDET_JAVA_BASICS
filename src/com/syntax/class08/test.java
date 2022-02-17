package com.syntax.class08;

import java.util.Scanner;


public class test {
    public static void main(String[] args)
    {

    }
    static int dec_formatter(int x){
        if(x>=1 || x<=9){
            return Integer.parseInt("0"+x);
        }
        return x;
    }

    static java.lang.String repeat(int n, java.lang.String str){
        java.lang.String repeated = new java.lang.String(new char[n]).replace("\0", str);
        return repeated;
    }
}
