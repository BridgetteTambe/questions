//package org.example.Q85;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//class Tester{
//     class Person implements Comparator<Person> {
//         private String name;
//
//         Person(String name) {
//             this.name = name;
//         }
//
//     }
//         public static void main(String[] args) {
//             Person[] people = {new Person("Joe"),
//                     new Person("Jane"),
//                     new Person("John")};
//
//             Arrays.sort(people);
//             for (Person person : people) {
//                 System.out.println(person.name);
//             }
//         }
//
//         @Override
//         public int compare(Person o1, Person o2) {
//             return 0;
//         }
//
//
//     }
//
