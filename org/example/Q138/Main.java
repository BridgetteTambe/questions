package org.example.Q138;

public class Main {

    public static void main(String[] args) {
        int i = 4;
        for(String s : args){
            System.out.println(s);
            break;

            // answer D
        }

        int k = 1;
        for(String y : args){
            System.out.println((k++) + ")" + y);

            // Answer B
        }

        int x = 1;
        for(String u : args){
            System.out.println((x++) + ")");

            // Answer E
        }

    }
}
