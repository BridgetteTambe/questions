package org.example.Q9;

public class Test {
    class L extends Exception{}
    class M extends L{}
    class N extends RuntimeException{}
    public void p() throws L{throw new M();}
    public void q() throws N{throw new N();}

    public static void main(String[] args) {
        try {
            Test t = new Test();
            t.p();
            t.q();
        } catch (L |N e) {    // and L e
            System.out.println("Exception caught");
        }
    }
}
