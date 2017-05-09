package org.learning.java8.MultiThreading._3_sleep_parallel;

public class App05 {
    public static void main(String[] args) {

//        for (int n = 0; n < 5; n++) {
//            sillyWork();
//            System.out.println("Bye!");
//        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    sillyWork();
                    System.out.println("Hello!");
                }
            }
        }).start();

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

    private static void sillyWorkWithThreadYield() {
        double d = 2.0;
        for (int i = 0; i < 100; i++) {
            Thread.yield();
            for (int j = 0; j < 100_000; j++) {
                d = Math.sin(d);
            }

        }
    }

}
