package org.example.Q27;

public class Tester {
    public static void main(String[] args) {
        String s = "hat at store";
        int x = s.indexOf("at");
      s = s.substring(x + 3);
        x= s.indexOf("at");
        System.out.println(s + " " + x);
    }
}
