package org.example.Q207;

public class Tester {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);

        sb.append("HOWDY");
        sb.insert(0, ' ');
        System.out.println(sb);
        sb.replace(2,3, "LL");
        System.out.println(sb);
        sb.insert(6, "COW");
        System.out.println(sb);
        sb.delete(2,7);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
