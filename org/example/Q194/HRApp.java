package org.example.Q194;

import java.util.ArrayList;

public class HRApp {
    String employee = String.valueOf(new ArrayList<Employee>());

    public String display() {
        var employee = new Employee();
        var offices = new ArrayList<>();
        offices.add("Chicago");
        offices.add("Bangalore");
        for (var office : offices) {
            System.out.println("Employees location" + office);
        }


        return null;
    }
}
