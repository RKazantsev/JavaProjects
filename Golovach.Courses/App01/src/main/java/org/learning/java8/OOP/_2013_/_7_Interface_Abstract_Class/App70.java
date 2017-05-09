package org.learning.java8.OOP._2013_._7_Interface_Abstract_Class;


public class App70 {
    public static void main(String[] args) {
        new Class();
        //new AbstractClass(); // not allowed
        //new Interface();        // not allowed
    }
}

class Class {
    void f() {}
}

abstract class AbstractClass {
    abstract void f();
    void g() {}
}

interface Interface {
    void f();
}