package org.learning.java8.MultiThreading._1_anonimous;

public class App01 {

    public static void main(String[] args) {

//        #1
//        Runnable r0 = new RunnableImpl();
//        Runnable r1 = new RunnableImpl();
//        r0.run();
//        r1.run();

//        #2
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("run()");
//            }
//        };
//        System.out.println(r.getClass().getName());
//        r.run();

//        #3
//        Runnable r0 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("run()");
//            }
//        };
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("run()");
//            }
//        };
//
//        r0.run();
//        r1.run();

//        #4
        for (int i = 0; i < 10; i++) {
            Runnable r0 = new Runnable() {
                @Override
                public void run() {
                    System.out.println("run()");
                }
            };
            r0.run();

        }
    }
}
