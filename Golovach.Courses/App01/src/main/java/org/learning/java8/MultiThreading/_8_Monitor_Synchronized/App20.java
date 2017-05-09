package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class App20 {
    public static void main(String[] args) {
        for (int k = 1; k < 6; k++) {
            int id = k;
            new Thread(new Runnable() {
                public void run() {
                    hello(id);
                }
            }).start();
        }
    }

    public synchronized static void hello(int id){
        System.out.println(id + " : * - wait - sleep");
        try {
            App20.class.wait(1000);
        } catch (InterruptedException ignore) {/*NOP*/}
        System.out.println(id + " : wait - * - sleep");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {/*NOP*/}
        System.out.println(id + " : wait - sleep - *" + System.currentTimeMillis() / 1000);
    }
}
