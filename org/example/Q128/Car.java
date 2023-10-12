package org.example.Q128;

public class Car extends Automobile {

    void wheels() {
        System.out.println(4);
    }

    public static void main(String[] args) {
        Automobile ob = new Car();
        ob.wheels();
    }


}
