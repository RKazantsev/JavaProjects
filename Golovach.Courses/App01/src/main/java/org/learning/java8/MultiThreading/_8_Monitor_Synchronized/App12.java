package org.learning.java8.MultiThreading._8_Monitor_Synchronized;

public class App12 {
    public static /*synchronized*/ void main(String[] args) {
        /*synchronized (App12.class) {*/
            App12.class.notify();
        /*}*/

    }
}
