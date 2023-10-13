package org.example.Q215;

public class B extends A{
    public int modifyVal(int val){
        if(checkValue(val)){
            return val;
        }else{
            return 0;
        }
    }



    private static boolean checkValue(int val) {
        return true;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.modifyVal(10));
    }
}

// B
// after fixing the erro return 10
