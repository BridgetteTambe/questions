package org.example.Q179;

public class ConSub extends ConSuper {
    ConSub() {
        this(4);
        System.out.println("3");
    }

    public ConSub(int i) {
//        super();
        System.out.println(i);
    }

    public static void main(String[] args) {
        new ConSub(4);
    }
}
