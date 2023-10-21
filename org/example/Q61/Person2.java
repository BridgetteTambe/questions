package org.example.Q61;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person2 {

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

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Person2> persons = new ArrayList<>(List.of(new Person2("Tom",101),
                new Person2("Aman",102),
                new Person2("Peter",102),
                new Person2("James",101)));

        persons.sort(Comparator.comparing(Person2::getAge).thenComparing(Person2::getName));


        persons.forEach(System.out::println);
    }
}
