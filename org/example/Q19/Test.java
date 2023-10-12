package org.example.Q19;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        var items = List.of(new Item("A", 10), new Item("B", 2),
                new Item("C", 12), new Item("D", 5), new Item("e", 6));

       // if (items.stream().filter(i -> count < 0).findAny()) {

            System.out.println("There is an item for which variable count is below zero");
        }
    }
//}

