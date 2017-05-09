package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class App17 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                hello(1);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                hello(2);
            }
        });

        thread1.start();
        thread2.start();
    }

    /*public synchronized static void hello(int id){
        System.out.println(id + " - I'm here!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ignore) {*//*NOP*//*}
    }*/

    public static void hello(int id){
        System.out.println(id + " - I'm here, A");
        synchronized (App17.class) {
            try {
                App17.class.wait(1000); // поток засыпает таким образом, что отвязывается от synchronized,
                                                // в отличие от sleep() см. App16, второй поток перехватывает управление
            } catch (InterruptedException ignore) {/*NOP*/}
        }
    }
}
