package org.example.Q30;

public class Test {
    public static void main(String[] args) {
validate3("j", 1233,344);
    }
    static float validate3(String s, float min,float max) throws IllegalArgumentException {
        float f = Float.parseFloat(s);
        if (f < min || f > max) {
            throw new IllegalArgumentException();
        }
        return f;








    }
}
