package org.example.Q109;

public class Test {
    private static class Greet{
        private void print(){
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {
        Test.Greet i = new Greet();
        i.print();
    }
}
