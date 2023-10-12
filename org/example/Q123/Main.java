package org.example.Q123;

public class Main {

    public static void greet(String... args) {
        System.out.println("Hello");
        for(String arg : args){
            System.out.println(arg);
        }
    }

    public static void main(String[] args) {
        Main c = null;
        System.out.println("Tabi");
         c.greet();
        Main.greet();
        System.out.println(c);
    }
}
