package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class SingleElementBuffer {
    private Integer elem = null;

    public synchronized void put (int newElem) throws InterruptedException {
        while (this.elem != null) { // исgользование while обспечивает свойство монитора spirious wakeup (случайное пробуждение)
            this.wait();
        }
        this.elem = newElem;
        this.notifyAll();
    }

    public synchronized int get() throws InterruptedException {
        while (this.elem == null) {
            this.wait();
        }
        Integer result = this.elem;
        this.elem = null;
        this.notifyAll();
        return result;
    }
}
