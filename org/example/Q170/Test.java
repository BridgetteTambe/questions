package org.example.Q170;

public class Test {
    public static void main(String[] args) {
        int x;
        int y = 5;
        if(y >2){
            x = ++y;
            y =x + 7;
            System.out.println(x + " " + y);
        }else{
            y++;

        }
        //System.out.println(x + " " + y);
    }
}
