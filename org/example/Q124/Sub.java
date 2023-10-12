package org.example.Q124;

public class Sub extends Super {
    static String greeting() {
        return "Good Night";
    }

    String name() {
        return "Harry";
    }
}


class Test{
    public static void main(String[] args) {
        Super s = new Super();
        System.out.println(s.greeting() + ", " +  s.name());
    }}
