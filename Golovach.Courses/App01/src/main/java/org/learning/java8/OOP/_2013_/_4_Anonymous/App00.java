package org.learning.java8.OOP._2013_._4_Anonymous;

import com.sun.org.apache.xpath.internal.SourceTree;

public class App00 {

    public static void main(String[] args) {
        /*Runnable r = new Runnable() {
            @Override
            public void run() {
            }
        };
        r.run();

        System.out.println(r.getClass().getName());*/

        int i = 10;
        System.out.println(Math.sin(i));

        new Thread(() -> System.out.println("Hello!")).start();

    }

}




