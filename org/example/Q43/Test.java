package org.example.Q43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Test {



    public static void main(String[] args) {

        List<String> longlist = List.of("Hello","World","Beat");
        List<String> shortlist = new ArrayList<>();
//        longlist.stream().filter(w -> w.indexOf('e') != -1)
//                .parallel()
//                .forEach(w -> shortlist.add(w));

       shortlist = longlist.stream().filter(w -> w.indexOf('e') != 1).parallel().collect(Collectors.toList());
    }



}
