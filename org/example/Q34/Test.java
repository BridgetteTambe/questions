package org.example.Q34;

public class Test {

    private final int x =1;
    static final int y = 2;

    public Test() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        new Test();
    }
}
