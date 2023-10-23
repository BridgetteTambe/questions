package org.example.Q94;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

       //Function<String> function = m -> m.toUpperCase();
        UnaryOperator<String> function = String::toUpperCase;
        List<String> fruits = new ArrayList<>(List.of("apple","orange","banana"));
        fruits.replaceAll(function);
    }
}
