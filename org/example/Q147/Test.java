package org.example.Q147;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> even = List.of();
        even.add(0, 2);
        even.add(0,-2);
        even.add(0,-3);
        System.out.println(even);
    }
}
