package org.learning.java8.Exceptions;

public class AppExceptions_9 {
    public static void main(String[] args) {
//        try {
//            throw new OutOfMemoryError();
//        } catch (Error e) {
//            throw new NullPointerException();
//        } catch (Exception e) {
//            throw new NullPointerException();
//        } finally {
//            System.err.println(0);
//        }
        System.out.printf("%f%n%2$+010.5f", squareRoot(1.2), squareRoot(1.6));
    }

    public static double squareRoot(double value) {
        try {
            if (value < 0) throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.out.println("Value is negative.");
        }
        return Math.sqrt(value);
    }
}
