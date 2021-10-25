package com.samira;

import java.util.HashSet;
import java.util.Set;


public class MainClass {
    public static void main(String[] args) {
        Person person1 =new Person(1,"mehdi","abbasi");
        Person person2 =new Person(2,"ali","rezaei");
        Person person3 =new Person(2,"ali","rezaei");


        Set<Person> set1=new HashSet<>();
        set1.add(person1);
        set1.add(person2);
        set1.add(person3);
        System.out.println(set1);
    }

}
