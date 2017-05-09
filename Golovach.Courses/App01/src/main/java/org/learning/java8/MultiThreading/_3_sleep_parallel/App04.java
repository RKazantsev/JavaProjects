package org.learning.java8.MultiThreading._3_sleep_parallel;

public class App04 {
    public static void main(String[] args) throws InterruptedException {
        for (int n = 0; n < 5; n++) {
            Thread.sleep(500);
            System.out.println("Hello!");
        }
    }
}
