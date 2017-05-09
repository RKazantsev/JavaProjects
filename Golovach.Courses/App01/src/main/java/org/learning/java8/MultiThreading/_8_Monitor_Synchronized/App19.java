package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class App19 {
    public static void main(String[] args) {
        for (int k = 0; k < 5; k++) {
            int finalK = k;
            new Thread(new Runnable() {
                public void run() {
                    hello(finalK);
                }
            }).start();
        }
    }

    public synchronized static void hello(int id){
        System.out.println(id + " - I'm here!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {/*NOP*/}
    }
}
