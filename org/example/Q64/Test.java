package org.example.Q64;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        List<String> list1 = new LinkedList<String>();
        Set<String> hs1 = new HashSet<String>();
        String[] v = {"a", "b", "c","b","a"};
        for(String s : v){
            list1.add(s);
            hs1.add(s);
        }


        System.out.println(hs1.size() + "" + list1.size() + " ");
    HashSet hs2 = new HashSet(list1);
    LinkedList list2 = new LinkedList();
        System.out.println(hs2.size() + "" + list2.size());
    }
}
