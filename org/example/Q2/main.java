package org.example.Q2;

public class main {
    public static void main(String args[]) {
        int result = 0;

        Abacus aba = (int e, int f) -> { return e * f; };
        Abacus aba1 = (a, b) -> a * b;

result = aba.calc(10,20);
        System.out.println(result);
    }
}
