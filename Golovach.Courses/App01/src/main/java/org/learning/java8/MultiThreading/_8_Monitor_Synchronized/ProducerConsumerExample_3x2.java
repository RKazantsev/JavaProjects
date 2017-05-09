package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class ProducerConsumerExample_3x2 {
    public static void main(String[] args) {
        SingleElementBuffer buffer = new SingleElementBuffer();

        new Thread(new Producer(1, 300, buffer)).start();
        new Thread(new Producer(100, 500, buffer)).start();
        new Thread(new Producer(1000, 700, buffer)).start();

        // Разрыв по ссылке - производителю и потребителю важно знать только где находится буффер!!!
        //                     Производитель и потребитель независимы!!!
        //      (Пример: хлебозаводы - хлебный магазин - покупатель)

        new Thread(new Consumer(1, buffer)).start();
        new Thread(new Consumer(2, buffer)).start();
    }
}
