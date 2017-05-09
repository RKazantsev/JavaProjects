package org.learning.java8.MultiThreading._4_daemon;

public class App07 {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().isDaemon());
        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {

                }
            }
        });

        newThread.setDaemon(false); // не демона нужно прибивать вручную
        newThread.setDaemon(true); // поток прибьется JVM автоматичеки по завершению программы
        newThread.start();
        System.out.println("Bye!");
//        System.exit(42);

    }
}
