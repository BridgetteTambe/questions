package org.example.Q195;

public class Test {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ABCD");
        s.replace(s.indexOf("A"), s.indexOf("D"), "Q");
        System.out.println(s);
    }
}
