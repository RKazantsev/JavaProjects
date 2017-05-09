package org.learning.java8.OOP._2014_.App01.App23;

// 1. Top-level class;
// 2. Nested classes:
//  2.1.1 Static nested class
//  2.1.2 Anonymous static nested class
//  2.2.1 Inner class
//  2.2.2 Anonymous inner class


public class App23 { // Top-level class

    static int k; // в PermGen памяти выделяется память под k

    static class X { // Другой смысл static, в PermGen памяти не выделяется память под класс
        class Y {
            class Z {}
        }
    }

    public static void main(String[] args) {
        class X {}
    }

    interface A {}
    class B implements A {}
}
