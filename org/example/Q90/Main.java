package org.example.Q90;

import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String... args) {

        List<Employee> list = List.of(new Employee("John", 80000.0),new Employee("Scott", 90000.0));
        double starts =0.0;
        double ratio = 1.0;
        BinaryOperator<Double> bo = (a, b) -> a+b;
       // double totalSalary = list.stream().map(e -> e.getSalary() * ratio).reduce(starts,bo);
        double totalSalary = list.stream().mapToDouble(e -> e.getSalary() * ratio).sum();
        System.out.println("Total salary =" + totalSalary);
    }
}

class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
