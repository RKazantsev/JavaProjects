package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class App15 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                hello(1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                hello(2);
            }
        });

        thread1.start();
        thread2.start();
    }

    public synchronized static void hello(int id){
        System.out.println(id + " - I'm here!");
        try {
//            while (true) {
                Thread.sleep(3000);
//            }
        } catch (InterruptedException ignore) {/*NOP*/}
    }
}
