package org.example.Q15;

import java.util.HashMap;
import java.util.*;
public class Main {
    static Map<String,String>map = new HashMap<>();
    static List<String>keys = new ArrayList<>(List.of("S","P","Q","R"));
    static String [] values ={"senate","people","of","rome"};
    static{
        for(var i=0; i< keys.size(); i++){
            map.put(keys.get(i), values[i]);
        }
    }

    @Override
    public String toString() {
        return "values";
    }

    public static void main(String[] args) {
        keys.clear();
        System.out.println(keys);
        values = new String[0];
        System.out.println(values.length);
        System.out.println(map.size());
    }
}
