package org.learning.java8.MultiThreading._3_sleep_parallel;

public class App06 {
    public static void main(String[] args) {

        Thread newThread = new Thread (new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    sillyWork();
                    System.out.println("Hello!");
                }
            }
        });

        newThread.setPriority(Thread.MIN_PRIORITY); //// Установление приоритета потоку, рекомендация шедулеру (не требование). Ставить перед start()
        newThread.start();

        for (int n = 0; n < 500; n++) {
            sillyWork();
            System.out.println("Bye!");
        }
    }

    private static void sillyWork() {
        double d = 2.0;
        for (int i = 0; i < 10_000_000; i++) {
            d = Math.sin(d);
        }
    }
}
