package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class ProducerConsumerExample_1x1 {
    public static void main(String[] args) throws InterruptedException {
        SingleElementBuffer buffer = new SingleElementBuffer();
        new Thread(new Producer(1, 1000, buffer)).start();


        // Разрыв связи по времени. (Пример: хлебозаводы - хлебный магазин - покупатель)
        //                     Производитель и потребитель независимы!!!

        Thread.sleep(5000);
        new Thread(new Consumer(1, buffer)).start();
    }
}
