package org.learning.java8.Exceptions;

public class AppExceptions_12 {
    public static void main(String[] args) throws Exception {
        try {
            throw new B();
        } catch (B e) {

        }
    }
}

class A extends Exception {}
class B extends A {}

