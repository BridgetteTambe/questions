package org.example.Q3;

public class Test extends AbstractCopier implements Copier{
    @Override
    public void print(String msg) {
        //System.out.println("TestImpl is working");
        Copier.super.print(msg);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.print("Attempt00");
    }
}
