package org.example.Q113;

public class Main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread(new MyThread()));
        Thread t2 = new Thread(new Thread(new MyThread()));
        Thread t3 = new Thread(new Thread(new MyThread()));

        t1.start();
        t2.run();
        t3.start();

        t1.start();
    }
}

    class MyThread implements Runnable {
        public void run () {
            System.out.println("Running.");
        }
    }
