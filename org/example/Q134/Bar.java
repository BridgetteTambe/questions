package org.example.Q134;





import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bar extends Foo {
    public void foo(Collection arg) {
        System.out.println("Hello world!");
    }

    public void foo(List arg) {
        System.out.println("Hola Mundo!");
    }

    public static void main(String[] args) {

        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar b1 = new Bar();
        Collection<String> c = new ArrayList<>();

        b1.foo(c);
        f2.foo(c);
        f1.foo(c);


        // Correct answer is D H I
    }
}

