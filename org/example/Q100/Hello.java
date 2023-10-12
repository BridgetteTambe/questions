package org.example.Q100;

public class Hello {

    class Greeting{
        void sayHi(){

        }
    }

    public static void main(String[] args) {
        Hello myH = new Hello(); Hello.Greeting myG = myH.new Greeting(); myG.sayHi();
    }
}
