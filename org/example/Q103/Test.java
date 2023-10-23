package org.example.Q103;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        var data = new ArrayList<>();
        data.add("Peter");
        data.add(30);
        data.add(40);
        data.add("Market Road");
        data.set(1, 25);
        data.remove(2);
        data.set(2, 1000L);

        System.out.print(data);
    }
}
