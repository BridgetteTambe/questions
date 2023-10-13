package org.example.Q212;

public class Test {
    private int num =1;
    private int div =0;

    public void divide(){
        try{
            num = num/div;
            System.out.println("Exception");
        }catch (ArithmeticException ae){
            num = 100;
        }catch(Exception e){
            num = 200;
        }finally {
            num = 0;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.divide();
    }
}
