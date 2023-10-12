package org.example.Q135;

public class Test {
    public static void main(String[] args) {


        String s = "";
        if (Double.parseDouble("11.00f") <= 11) {
            s += 1;
            System.out.println("First:" + s);
        }

        if (1_7 != Integer.valueOf("17")) {
            s += 2;
            System.out.println("S:" + s);
        }

        if (1024 > 1023L) {
            s += 3;
            System.out.println("third:" + s);
        }
        System.out.print(s);
    }

}
