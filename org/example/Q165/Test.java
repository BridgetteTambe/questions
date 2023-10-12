package org.example.Q165;

public class Test {

 static String prefix ="Global";

    private static String name = "namescope";

 public static String getName(){
     return new Test().name;
 }

    public static void main(String[] args) {
        Test t = new Test();
//System.out.println(name+prefix);
    }
}
