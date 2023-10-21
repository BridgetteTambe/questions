package org.example.Q4;

public class Test {

    static String prefix ="domain";

    private static String name = "mondail";

    public static String getName(){
        return new Test().name;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(prefix + name);
System.out.println(prefix + getName());
        System.out.println(new Test () .prefix + new Test().name);
        System.out.println(Test.prefix + Test.getName());
    }



}
