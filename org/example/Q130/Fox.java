package org.example.Q130;

public class Fox implements Forest,Town {


    public static void main(String[] args) {
        Fox fo = new Fox();
        fo.inhabit();
    }


    @Override
    public void inhabit() {
        Forest.super.inhabit();
    }
}
