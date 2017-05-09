package org.learning.java8.OOP._2014_.App01.App02;

public class App02 {
    public static void main(String[] args) {
        fun(new int[] {0, 1, 2});
        fun("Hello!");
        fun(new double[] {0.0});
    }

    public static void fun(Object obj) {
        if (obj instanceof int[]) {
            System.err.println(((int[]) obj)[1]);
        } else if (obj instanceof String) {
            System.err.println(((String) obj).charAt(1));
        } else {
            throw new IllegalArgumentException("Alarm!");
        }

    }
}
