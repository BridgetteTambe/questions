package org.example.Q17;

//DONT UNDERSTAND

import java.util.Arrays;
import java.util.Comparator;

public class City {
//    public static void main(String[] args) {
//        String [] towns = {"boston","paris","bangkok","oman","oman","oman"};
//        Comparator<String>ms =(a,b) -> b.compareTo(a);
//        Comparator<String>ms = Comparator.reverseOrder();
//        Comparator<String>ms = String::compareTo;
//       Arrays.sort(towns,ms);
//        for (String t: towns) {
//            System.out.print(t+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.binarySearch(towns,"oman",ms));
//
//        for (String t: towns) {
//            System.out.print(t+" ");
//        }
//        System.out.println("\nNo ms: "+Arrays.binarySearch(towns,"oman"));

        public static void main(String[] args) {
            String[] towns = {"boston", "paris", "bangkok", "oman"};
            Comparator<String> ms = (a, b) -> b.compareTo(a);
            int oman = Arrays.binarySearch(towns, "oman", ms);
            System.out.println(oman);
        }

    }

