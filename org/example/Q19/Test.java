package org.example.Q19;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var items = List.of(new Item("A", 10), new Item("B", 2),
                new Item("C", 12), new Item("D", 5), new Item("e", 6));

        //if(items.stream().filter(i -> i.count < 0).findFirst()) {
            //if (items.stream().anyMatch(i -> i.count < 0 )) {
            System.out.println("There is an item for which variable count is below zero");
        }

}

