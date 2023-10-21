package org.example.Q84;


public class Test extends CustomerType {
    public static void main(String[] args) {
        String[] words = {"banana","banana","orange", "apple", "lemon"};
        Integer[] numbers = {1,1, 2, 3, 4,4, 5};
        CustomerType type = new CustomerType();
        CustomerType<String> stringType = new CustomerType<>();
        System.out.println(stringType.count(words, "banana"));
        System.out.println(type.count(words, "orange"));
        System.out.println(type.count(numbers, 4));
    }
}