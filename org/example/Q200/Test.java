package org.example.Q200;

import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Iterator iter = List.of(1,2,3).iterator();
        while(iter.hasNext()){
            foo(iter.next());
        }

        Iterator iter2 = List.of(1,2,3).iterator();
        while(iter.hasNext()){
            bar(iter2.next());
        }

        for(Iterator iter3 = List.of(1,2,3).iterator(); iter.hasNext();){
            foo(iter.next());
        }

        for(Iterator iter4 = List.of(1,2,3).iterator(); iter.hasNext();){
            bar(iter2.next());
        }

    }

     static void bar(Object next) {
    }

     static void foo(Object next) {
    }
}
