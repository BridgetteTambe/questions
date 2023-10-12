package org.example.Q181;

public class Over {
    public void analyze(Object[] o){
        System.out.println("i am an object array");
    }

    public void analyze(long[] o){
        System.out.println("i am an array");
    }

    public void analyze(Object o){
        System.out.println("i am an object");
    }

    public static void main(String[] args) {
        Integer [] nums = new Integer[10];
        new Over().analyze(nums);
    }

    // D correct
}
