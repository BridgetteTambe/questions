package org.example.Q14;

public class Test {

    public static void main(String[] args) {
        StringBuilder text1 = new StringBuilder("PPQRRRSTT");
        System.out.println(text1.length());
        int i = 0;
        a:
        while (i < text1.length()) {
            char x = text1.charAt(i);
            int j = 0;
            i++;
            //System.out.println(j);
            b:
            while (j < text1.length()) {
                char y = text1.charAt(j);
                if (i != j && y == x) {
                    text1.deleteCharAt(j);
                     continue a;
                   // break b;            //line 1
                }
                j++;
            }
        }
        System.out.println(text1);
    }
}


