package org.learning.java8.OOP._2013_._2_Polymorphism;

/*
Polymorphism:
1) Universal:
    - Parametric polymorphism
    - Subtyping
2) Ad hoc:
    - Typecasting
    - Operator Overloading
    - Function Overloading
*/

import java.util.ArrayList;

public class App00 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add(0, "Hello, ");
        arr.add(1, "World!");
        System.out.println(arr.toString());

        Person client1 = new Person("Vasya", 25);
        Person client2 = new Person("Vasya", 25);

        System.out.println(new WithVersion<>(client1, 1).compareTo(new WithVersion<>(client2, 2)));

    }
}



