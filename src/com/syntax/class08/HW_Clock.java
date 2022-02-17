package com.syntax.class08;

public class HW_Clock {
    public static void main(String[] args) {

        for(int hr=1; hr<=24; hr++){
            for(int min=0; min<60; min++){
                for(int sec=0; sec<60; sec++){
                    String hrr= String.format("%02d", hr);
                    String minn =String.format("%02d", min);
                    String secc = String.format("%02d", sec);
                    System.out.println(hrr+":"+minn+":"+secc);
                }
            }
        }
    }
}
