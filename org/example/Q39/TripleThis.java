package org.example.Q39;


import java.util.function.*;

public class TripleThis {
    public static void main(String[] args) {

           // Function tripler = x -> { return (Integer) x * 3; };
        Function<Integer, Integer> tripler = x -> { return (Integer) x * 3; };
            TripleThis.printValue(tripler, 4);
        }
        //public static <T> void printValue(Function f, T num){
        public static <T> void printValue(Function<T, T>f, T num){
            System.out.println(f.apply(num));
        }
    }

