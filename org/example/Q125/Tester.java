package org.example.Q125;

import org.w3c.dom.ls.LSOutput;

public class Tester {
    public static void main(String[] args) {
        Person p = null;
        checkPerson(p);
        System.out.println(p);
        p = new Person("null");
        checkPerson(p);
        System.out.println(p);

    }

    public static Person checkPerson(Person p) {

if(p == null){
    p = new Person("Joe");

}else {
    p = null;
}
        //System.out.println(p);
return p;
    }
}
