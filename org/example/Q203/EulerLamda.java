package org.example.Q203;

public class EulerLamda {
    public static void main(String[] args) {

        EulerInterface myEulerInterface;
        myEulerInterface = () -> 2.71828;
        System.out.println(myEulerInterface.getEulerValue());
    }
}
