package org.example.Q67;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {


    Integer [] intArray = {2,1,3,4,5};
    List<Integer> list = new ArrayList<>(Arrays.asList(intArray));
    list.parallelStream().forEachOrdered(e -> System.out.print(e + " "));

    }
}
