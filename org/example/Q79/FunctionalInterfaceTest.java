package org.example.Q79;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
        List fruits = Arrays.asList("apple","orange","banana");
        Consumer<String> c =System.out::println;
        System.out.println(fruits);
        Consumer<String> output = (x -> System.out.println(":" + x.toUpperCase()));

        fruits.forEach(output);
    }
}
