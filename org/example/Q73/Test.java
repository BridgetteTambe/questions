package org.example.Q73;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        int arr[][] ={{5,10},{8,12},{9,3}};
        long count = Stream.of(arr)
                .flatMapToInt(IntStream::of)
                .map(n -> n +1)
                .filter(n -> (n % 2 != 0))
                .peek(System.out::println)
                .count();
        System.out.println("Count : " + count);


//        int arr[][] ={{5,10},{8,12},{9,3}};
//        long count = Stream.of(arr)
//                .map(IntStream::of)
//                .map(n -> n +1)
//                .filter(n -> (n % 2 != 0))
//                .peek(v -> System.out.print(v+" "))
//                .count();
//        System.out.print(" " + count);                result in compilation error


    }
}
