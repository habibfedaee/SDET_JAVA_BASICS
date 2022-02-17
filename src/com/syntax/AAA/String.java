package com.syntax.AAA;

public class String {

    static java.lang.String repeatString(int n, java.lang.String str){
        java.lang.String repeated = new java.lang.String(new char[n]).replace("\0", str);
        return repeated;
    }

    public static void main(java.lang.String[] args){

        java.lang.String dash = "-";
        java.lang.String repeated = new java.lang.String(new char[20]).replace("\0", "-");
        System.out.println(repeated);
        System.out.println(repeatString(20, "ha"));
        System.out.println(repeatString(100, "-"));
    }

}
