package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class App13 {
    public static void main(String[] args) {
        synchronized (new Object()){
            new Object().notify(); // засинхрон-сь по одному объекту, а вызываем по другому, поэтому exception
        }
    }
}
