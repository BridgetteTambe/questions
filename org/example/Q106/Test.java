package org.example.Q106;

import java.util.List;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {

        var numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
 Function<Integer, Integer> f = n -> n * 2;

        StringBuilder sb = new StringBuilder();
   for(int a : numbers){
       sb.append(f.apply(a));
       sb.append(" ");
   }
        System.out.println(sb.toString());

    }
}
