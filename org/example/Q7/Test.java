package org.example.Q7;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Test {

    private int age;

    private void setAge(int age) {
        this.age = age;
    }

    private int getAge() {
        return age;
    }

    public static void main(String[] args) {
Test t = new Test();
t.setAge(12);
        System.out.println(t.getAge());


        Integer [] ints ={1,2,3,4,5,6,7};
       var list = Arrays.asList(ints);
        UnaryOperator<Integer> uo = x -> { return x * 3; };
        list.replaceAll(uo);
    }
}
