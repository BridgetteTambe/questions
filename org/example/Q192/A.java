package org.example.Q192;

public class A {


    public int x = 42;
    protected A(){

    }
    public static class B extends A {
        int x = 17;

        public B() {
            super();

        }
    }

        public class Tester{
            public static void main(String[] args) {
                A obj = new B();
                System.out.println(obj);
            }
        }
    }

