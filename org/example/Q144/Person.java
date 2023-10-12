package org.example.Q144;

public class Person {
    private String name;

    public void setName(String name){
        String title ="Dr. ";
        System.out.println(title);
      name = title+name;
    }

    public  String toString(){
        return name;
    }
}

