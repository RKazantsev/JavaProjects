package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class ProducerConsumerExample_NxM {
    public static void main(String[] args) {

        SingleElementBuffer bufferA = new SingleElementBuffer();
        new Thread(new Producer(1, 1000, bufferA)).start();
        new Thread(new Consumer(1, bufferA)).start();
        new Thread(new Consumer(2, bufferA)).start();

        SingleElementBuffer bufferB = new SingleElementBuffer();
        new Thread(new Producer(100, 500, bufferB)).start();
        new Thread(new Producer(1000, 450, bufferB)).start();
        new Thread(new Consumer(3, bufferB)).start();
    }
}
