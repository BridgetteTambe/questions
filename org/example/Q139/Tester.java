package org.example.Q139;

public class Tester {
    public static void main(String[] args) {
        byte x =7, y=6;
        float z = Math.round((float)x/y*100)/(float)100;
        System.out.println(z);


        byte a =7, b=6;
        float d = (float)(Math.round((float)a/b*100)/100);
        System.out.println(d);
    }
}
