package org.example.Q74;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {


        Consumer consumer = System.out::print;
        consumer.accept("Hello lamda!");
    }
}
