package org.example.Q36;

public class Y extends X {
    public Y(String name) {
        super();
       setName(name);
    }

    public static void main(String[] args) {
        Y y = new Y("HH");
        System.out.println(y);
    }         // answer is A cannot inherit from a final class.
    // after removing the final from X the correct answer becomes D



    // without the toString andswer will be    B


//    public Y(String name) {
//        super();
//        setName(name);
//    }
//
//    public static void main(String[] args) {
//        Y y = new Y();
//        System.out.println(y);
//    }          // answer A






}
