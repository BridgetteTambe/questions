package org.example.Q69;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        List list2 = List.copyOf(list1);
//        list2.add("C");
        List<List<String>> list3 = List.of(list1, list2);
        System.out.println(list3);

    }

}
