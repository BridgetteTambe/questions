package org.example.Q179;

public class ConSuper {
    protected ConSuper(){
        this(2);
        System.out.println("1");
    }

    public ConSuper(int a) {
        super();
        System.out.println(a);
    }
}

