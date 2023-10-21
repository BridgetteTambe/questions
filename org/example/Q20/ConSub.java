package org.example.Q20;

public class ConSub extends ConSuper {

    public ConSub() {
        //this(4);
        System.out.println("1");
    }

    public ConSub(int a) {
       // super(a);
        System.out.println(a);
    }

    public static void main(String[] args) {
        new ConSub(4);
    }
}
