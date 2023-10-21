package org.example.Q58;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {


        var pool = Executors.newFixedThreadPool(5);
        Future outcome = pool.submit(() -> System.out.println());
    }
}
