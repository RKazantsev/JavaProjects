package org.learning.java8.Exceptions;

public class AppExceptions_7 {
    public static void main(String[] args) {
        f();
    }

    public static void f() {
        System.err.println(0);
        try {
            System.err.println(1);
            if (true) throw new Error();
        } finally {
            System.err.println(2);
            if (true) return;
//            if (true) throw new RuntimeException();
        }
        System.err.println(3);
    }
}
