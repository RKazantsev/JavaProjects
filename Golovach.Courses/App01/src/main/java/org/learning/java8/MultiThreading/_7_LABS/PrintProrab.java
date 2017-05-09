package org.learning.java8.MultiThreading._7_LABS;

public class PrintProrab implements Runnable{

    @Override
    public void run() {
        System.out.println("prorab runs");

        for (int i = 0; i < 3; i++) {
            // A + B
            Runnable printerA = new PrintRunnable("A   .", 100);
            Thread threadA = new Thread(printerA);
            threadA.start();

            Runnable printerB = new PrintRunnable(".   B", 99);
            Thread threadB = new Thread(printerB);
            threadB.start();

            try {
                threadA.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                threadB.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //C
            System.out.println("-----");
            Runnable printerC = new PrintRunnable("  C", 100);
            Thread threadC = new Thread(printerC);
            threadC.start();
            try {
                threadC.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("-----");
        }
        System.out.println("prorab ends");
    }
}
