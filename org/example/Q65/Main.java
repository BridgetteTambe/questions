package org.example.Q65;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> result = numbers.stream().filter(x -> x % 3 != 0).reduce((i, j) -> i + j);
        List<Integer> collect = numbers.stream().filter(x -> x % 3 != 0).collect(Collectors.toList());
        collect.forEach( s -> System.out.print(s+" "));
        System.out.println();
        result.ifPresent(System.out::println);


    }
}
