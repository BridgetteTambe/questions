package org.example.Q37;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String... args) {

        List<String> list1 = new ArrayList<>(List.of("Plane","Automobile","Motocycle"));
        List<String> list2 = new ArrayList<>(List.copyOf(list1));
        System.out.println(list1.equals(list2));

        list1.sort((String item1, String item2) -> item1.compareTo(item2));
        list2.sort((String item1, String item2) -> item2.compareTo(item1));
        System.out.println(list1.equals(list2));
    }
}
