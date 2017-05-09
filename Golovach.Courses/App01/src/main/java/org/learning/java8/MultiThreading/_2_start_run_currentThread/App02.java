package org.learning.java8.MultiThreading._2_start_run_currentThread;

public class App02 {
    public static void main(String[] args) {
//     #1
//        Runnable r = new RunnableImpl();
//        Thread newThread = new Thread(r);
//        newThread.start();

//     #2
        System.out.println("main() : " + Thread.currentThread().getName());

        Thread newThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run() : " + Thread.currentThread().getName());
            }
        });
        newThread.start();

    }
}
