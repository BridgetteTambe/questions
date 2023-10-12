package org.example.Q47;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {


        LocalDate d1 = LocalDate.of(1997, 2, 7);
        DateTimeFormatter d =
                DateTimeFormatter.ofPattern("eeee d'th of' MMMM yyyy");
        System.out.println(d.format(d1));

    }
}




