package org.example.Q26;

public class Avater extends GameObject {
    public Object [] move (Number x, Number y){
        System.out.println("Move Character");
        return super.move(x.intValue(), y.intValue());
    }

    public static void main(String... args) {
       var character = new Avater();
       character.move(10.0,10.0);
       //character.move(10,10);
    }
}
