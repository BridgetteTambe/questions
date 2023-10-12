package org.example.Q110;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> value = createValue();
        String str = value.orElse("Duke");
        System.out.println(str);
    }

    private static Optional<String> createValue() {
        String s = null;
        //System.out.println(s);
        return Optional.ofNullable(s);
    }
}
