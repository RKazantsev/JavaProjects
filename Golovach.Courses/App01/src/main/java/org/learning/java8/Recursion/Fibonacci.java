package org.learning.java8.Recursion;

public class Fibonacci {

    public static int sumFibonacci(int n) {

        return n < 2 ? 1 : sumFibonacci(n - 2) + print(n) + sumFibonacci(n - 1);
    }

    public static int print(int arg) {
        System.out.print(" " + arg);
        return 0;
    }
}
