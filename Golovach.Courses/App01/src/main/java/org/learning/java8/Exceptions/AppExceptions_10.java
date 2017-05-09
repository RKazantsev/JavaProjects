package org.learning.java8.Exceptions;

public class AppExceptions_10 {
    public static void main(String[] args) {
        System.err.println("f:before");
        try {
            f();
        } catch (Error e){
            System.err.println("f:catch");
        }
        System.err.println("f:after");
    }

    public static void f() {
        System.err.println("g:before");
        try {
            try {
                g();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            System.err.println("g:finally");
        }
        System.err.println("g:after");
    }

    public static void g() throws Exception{
        throw new Exception();
    }
}
