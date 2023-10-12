package org.example.Q186;

import java.util.ArrayList;
import java.util.Arrays;

public class NewMain {
    public static void main(String[] args) {

        String [] fruitNames = {"apple", "orange","grape","lemon","apricot", "waterlemon"};
        var fruits = new ArrayList<>(Arrays.asList(fruitNames));
        fruits.sort((var a, var b) -> -b.compareTo(a));
        fruits.forEach(System.out::println);
    }
}
