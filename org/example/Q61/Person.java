package org.example.Q61;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return name
                ;
    }
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>(List.of(new Person("Tom",40),
                new Person("Aman",40),
                new Person("Peter",40)));


        List<Person> persons1 = new ArrayList<>(List.of(new Person("Tom",43),
                new Person("Tyson",40),
                new Person("Peter",40)));

        persons.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed());

        persons1.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName).reversed());

        persons.forEach(System.out::println);

        persons1.forEach(System.out::println);
    }
}
