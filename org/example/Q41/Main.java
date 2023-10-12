package org.example.Q41;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add("hello");
        l.add("world");
        print(l);
    }


    private static void print(List<String>... args){
        for (List<String> str : args){
            System.out.println(str);
        }
    }
}
