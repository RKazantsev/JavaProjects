package org.learning.java8.MultiThreading._7_LABS;

public class Thread_Prorab_And_Employees {

    public static void main(String[] args) throws InterruptedException {

        Runnable prorab = new PrintProrab();
        Thread threadProrab = new Thread(prorab);
        threadProrab.start();
        threadProrab.join();
    }
}


