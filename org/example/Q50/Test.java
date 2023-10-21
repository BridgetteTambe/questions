package org.example.Q50;

import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

public class Test {

        public static void main(String[] args) throws IOException {
            final List<String> fruits = List.of("Orange", "Apple", "Lemmon", "Raspberry");
            final List<String> types =
                    List.of("Juice", "Pie", "Ice", "Tart");
            final var stream = IntStream.rangeClosed(0, Math.min(fruits.size(), types.size()))
                    .mapToObj((i) -> fruits.get(i) + " " + types.get(i));
            stream.forEach(System.out::println);
        }
    }

