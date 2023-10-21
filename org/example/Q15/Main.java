package org.example.Q15;

import java.util.HashMap;
import java.util.*;
public class Main {
//    static Map<String,String>map = new HashMap<>();
//    static List<String>keys = new ArrayList<>(List.of("S","P","Q","R"));
//    static String [] values ={"senate","people","of","rome"};
//    static{
//        for(var i=0; i< keys.size(); i++){
//            map.put(keys.get(i), values[i]);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "values";
//    }
//
//    public static void main(String[] args) {
//        keys.clear();
//        System.out.println(keys);
//        values = new String[0];
//        System.out.println(values.length);
//        System.out.println(map.size());
//    }


//    static Map<String, String> map = new HashMap<>();
//    static List<String> keys = new ArrayList<>(List.of("S", "P", "Q", "R", "S"));
//    static String[] values = {"Getting", "To", "Be", "Real"};
//    static {
//        for (var i = 0; i < keys.size(); i++) {
//            map.put(keys.get(i), values[i]);
//        }
//    }
//    public static void main(String[] args) {
//        keys.clear();
//        values = new String[0];
//        System.out.println("Keys: " + keys.size() + " Values: " + values.length+
//                " Map: " + map.size());
//    }


    static Map<String, String> map = new TreeMap<>();
    static List<String> keys = new ArrayList<>(List.of("S", "P", "Q", "R", "S"));
    static String[] values = {"Getting", "To", "Be", "Real", "NOW"};
    static {
        for (var i = 0; i < keys.size(); i++) {
            System.out.println(i);
            map.put(keys.get(i), values[i]);
        }
    }
    public static void main(String[] args) {
        keys.clear();
        values = new String[0];
        System.out.println("Keys: " + keys.size() + " Values: " + values.length+
                " Map: " + map.size());
        System.out.println(map);
    }




}
