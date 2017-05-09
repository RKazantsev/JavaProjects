package org.learning.java8.MultiThreading._6_DeadLock;

public class App09 {
    public static void main(String[] args) throws InterruptedException {

//       Thread.currentThread().join(); // самый короткий дедлок, но не самый классический ("Не умрешь, пока не выпьешь на своих похоронах")

//       Классический дедлок
        final Thread[] threads = new Thread[2];
        threads[0] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("#0 join to #1");
                    threads[1].join();
                } catch (InterruptedException ignore) {
                }
            }
        });

        threads[1] = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("#1 join to #0");
                    threads[0].join();
                } catch (InterruptedException ignore) {
                }
            }
        });
        threads[0].start();
        threads[1].start();
    }
}
