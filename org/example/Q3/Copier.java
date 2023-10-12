package org.example.Q3;

public interface Copier {
    public default void print(String msg){
        System.out.println("Message from Copier:" + msg);
    }
}
