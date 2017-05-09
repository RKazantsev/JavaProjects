package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class App18 {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            Thread.sleep(2000);
            double d = 2.0;
            for (int i = 0; i < 100_000_000; i++) {
                d = Math.sin(d);
            }
        }
    }
}
