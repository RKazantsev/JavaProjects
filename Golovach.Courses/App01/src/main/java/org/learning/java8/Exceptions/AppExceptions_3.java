package org.learning.java8.Exceptions;

public class AppExceptions_3 {
    public static void main(String[] args) throws  Throwable{
        System.err.println("f:before");
        try {
            f();
        } catch (RuntimeException e) {
            System.err.println("BAD...f:catch");
        }
        System.err.println("f:after");
    }

    private static void f() {
        System.err.println("g:before");
        g();
        System.err.println("g:after");
    }

    private static void g() {
//        return;
        throw new RuntimeException();
    }

}
