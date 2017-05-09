package org.learning.java8.MultiThreading._3_sleep_parallel;

public class App03 {
    public static void main(String[] args) {
        for (int n = 0; n < 50; n++) {
            sillyWork();
            System.out.println("Hello!");

        }
    }

    private static void sillyWork() {
        double d = 2.0;
        for (int k = 0; k < 10_000_000; k++) {
            d = Math.sin(d);
        }
    }
}
