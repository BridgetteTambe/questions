package org.example.Q4;

public class Test {

    static String prefix = "Mondial";
    private static String name = "domainmodal";

public static String getName(){
    return new Test().name;
}
    public static void main(String[] args) {
    Test test = new Test();

        System.out.print(prefix + name);
    }
}
