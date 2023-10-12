package org.example.Q204;

public class Tester {

    private int x;
    private int y;

    public static void main(String[] args) {
        Tester t1 = new Tester();
        t1.x =2;
        t1.y =3;
       // Tester.y =3;
        Tester t2 = new Tester();
        t2.x = 4;
        t2.y = 5;
        System.out.println(t1.x + "," + t1.y);
        System.out.println(t2.x + "," + t1.y);
        System.out.println(t2.x + "," + t1.y);
    }
}
