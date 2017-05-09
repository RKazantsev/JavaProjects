package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class App11 {
    public static void main(String[] args) throws InterruptedException {

//        public synchronized void main(String[] args) throws InterruptedException {//
//        synchronized не статического метода равносильно :
//        synchronized(this) {
//        }
//          поскольку есть указатель this на тот объект, чей метод вызван


//        new Object().wait();

//        new Object().notify();

//        new Object().notifyAll();

//        Reentrant lock
//        Object ref = new Object();
//        synchronized (ref) {
//            synchronized (ref) {
//                synchronized (ref) {
//                    ref.notify();
//                }
//            }
//        }

//      Синхронизация происходит по объекту, а не по ссылке!!!
        Object ref0 = new Object();
        Object ref1 = ref0;
        synchronized (ref0) {
            ref1.notify();
        }

        Object ref2 = new Object();
        Object ref3 = new Object();
        synchronized (ref2) {
            synchronized (ref3) {
                ref2.notify();
                ref2.notify();
                ref2.notify();   // смена порядка может привести к DeadLock'y
                ref3.notify();
                ref3.notifyAll();
                ref3.notify();
            }
        }
    }
}
