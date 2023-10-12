package org.example.Q183;

public class Test {

    public static  void main(String[] args) {
        AnotherClass ac = new AnotherClass();
        SomeClass sc = new SomeClass();
        sc = ac;
        sc.methodA();
        ac.methodA();
    }
}

class SomeClass{
    public void methodA(){
        System.out.println("SomeClass#methodA()s");
    }
}

class AnotherClass extends SomeClass{
    public void methodA(){
        System.out.println("AnotherClass#methodA()");
        }
        }
