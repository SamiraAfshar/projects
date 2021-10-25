package com.samira;

public class MainClass {
    public static void main(String[] args) {
    Person person1= new Person(1,"mehdi","abbasi");
    Person person2= new Person(2,"ali","rezaei");
    Person person3= new Person(2,"ali","rezaei");

        System.out.println(person1.equals(null));
        System.out.println(person2.equals(person3));
    }


}
