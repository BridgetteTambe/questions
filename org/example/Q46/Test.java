package org.example.Q46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {


         List<? super Short> list1 = new ArrayList<Number>();
        // List<? super Number> list2 = new ArrayList<Integer>();
         List<? extends Number> list3 = new ArrayList<Byte>();
       //  List<? extends Number> list4 = new ArrayList<Object>();
        // List<? super Float> list5 = new ArrayList<Double>();
         List<? super Float> list6 = new ArrayList<Number>();
         List<? super Float> list7 = new ArrayList<Number>();
         List<? extends Number> list8 = new ArrayList<Short>();
    }
}
