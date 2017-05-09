package org.learning.java8.MultiThreading._5_join;

public class App08 {
    public static void main(String[] args) throws InterruptedException {
        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    sillyWork();
                    System.out.println("Hello!");
                }
            }
        });

        newThread.start();

        for (int i = 0; i < 3; i++) {
            sillyWork();
            System.out.println("Bye!");
        }

        newThread.join(); // присоединяемся к newThread и ждем пока newThread не исчезнет. Может не исчезнуть и повиснуть и основной поток вместе с ним.
        System.out.println("That's All!");
    }

    private static void sillyWork() {
        double d = 2.0;
        for (int i = 0; i < 10000000; i++) {
            d = Math.sin(d);
        }
    }
}
