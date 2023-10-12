package org.example.Q185;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        while (x < 10) {
            System.out.println(x++);


            for (int d = 0; d < 10; ) {
                System.out.println("d :" + d);
                ++d;
            }

            for(int c =0; ; c++){
                System.out.println("C :" +c);
                if(c == 10);
                break;
            }
        }
    }
}
