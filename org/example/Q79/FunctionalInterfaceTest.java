package org.example.Q79;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {
//        List fruits = Arrays.asList("apple","orange","banana");
//        Consumer<String> c =System.out::print;
//       // System.out.println(fruits);
//        Consumer<String> output = c.andThen (x -> System.out.println(":" + x.toUpperCase()));
//
//        fruits.forEach(output);   // prints E



//        List fruits = Arrays.asList("apple","orange","banana");
//       Consumer<String> c =System.out::print;
//        //System.out.println(c);
//       System.out.println(fruits);
//       Consumer<String> output = (x -> System.out.println(":" + x.toUpperCase()));
//       fruits.forEach(output);

       // prints B

        Runnable r = () -> {System.out.println("Message");};

//        List fruits = Arrays.asList("apple","orange","banana");
//        Consumer<String> c =System.out::print;
//        //System.out.println(c);
//        System.out.println(fruits);
//        Consumer<String> output = (x -> System.out.println(":" + x.toUpperCase()));
//        fruits.forEach(output);
        //Correct D



        List fruits = Arrays.asList("apple","orange","banana");
        Consumer<String> c =System.out::print;
        Consumer<String> output =  c.andThen(x -> System.out.print(":" + x.toUpperCase()));

        fruits.forEach(output);

    }
}
