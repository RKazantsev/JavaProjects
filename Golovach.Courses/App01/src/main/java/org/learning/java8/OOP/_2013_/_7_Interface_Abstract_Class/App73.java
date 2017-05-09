package org.learning.java8.OOP._2013_._7_Interface_Abstract_Class;

public class App73 {

    public static void main(String[] args) {
        new App73().equals(new App73());
        //new App73().equals((Object) new App73());

    }

    // Overloading, не Overriding
    public boolean equals(App73 that) {
        System.out.println("Overloaded equals()");
        return false;
    }

    // Overriding
    @Override
    public boolean equals(Object obj) {
        System.out.println("Overridden equals()");
        return false;
    }
}
