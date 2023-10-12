package org.example.Q143;

public class Test {

    private int sum;
    public int compute(){
        int x =0;
        while(x < 3){
            sum += x++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int sum = t.compute();
        t.compute();
        t.compute();
        System.out.println(sum);

        // answer c

        int sum1 = t.compute();
       sum1 = t.compute();
       t.compute();
        System.out.println(sum1);
    }
}
