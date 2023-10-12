package org.example.Q167;

public class Test {
    public static void main(String[] args) {

        int x = 0;
        do{
            x++;
            System.out.println(x);
            if(x==1){
                System.out.println(x);
                continue;
            }
            System.out.println("x:" + x);
        }while (x < 1);
    }

    // d correct
}
