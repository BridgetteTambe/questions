package org.example.Q164;
import java.util.List;
import java.util.Set;

public class Foo {
    public List<Number> foo(Set<CharSequence> m) {
        return null;
    }

    public class Bar extends Foo{

        public List<Number> foo(Set<CharSequence> m) { return null; }

        //Ans B C
    }

}
