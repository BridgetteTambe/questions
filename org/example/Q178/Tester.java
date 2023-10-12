package org.example.Q178;

public class Tester {
    public static void main(String[] args) {
        String s = "this is it";
        int x = s.indexOf("is");
        System.out.println(x);
       s = s.substring(x+11);
        x = s.indexOf("is");
        System.out.println(s + " " + x);
    }
}
