package org.example.Q105;

import java.util.Optional;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        var fruits = List.of("apple", "orange", "banana", "lemon");

        fruits.stream().filter(f -> f.contains("n")).forEachOrdered(System.out::print);
       // Optional<String> result = fruits.stream().filter(f -> f.contains ("n")).findFirst ();
       // Optional<Boolean> result = fruits.stream().anyMatch(f -> f.contains("n"));

        //Answer B
    }
}
