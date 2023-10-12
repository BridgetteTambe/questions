package org.example.Q84;


public class Test extends CustomerType {
    public static void main(String[] args) {
        String[] words = {"banana","orange", "apple", "lemon"};
        Integer[] numbers = {1, 2, 3, 4, 5};
        CustomerType type = new CustomerType();
        CustomerType<String> stringType = new CustomerType<>();
        System.out.println(stringType.count(words, "apple"));
        System.out.println(type.count(words, "apple"));
        System.out.println(type.count(numbers, 3));
    }
}