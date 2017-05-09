package org.learning.java8.MultiThreading._7_LABS;

public class Thread_Rabbit_Attack {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i < Integer.MAX_VALUE ; i++) {
            String spaces = spaces(i);
            Runnable printer = new PrintRunnable(spaces + i, 100);
            Thread thread = new Thread(printer);
            thread.start();
            Thread.sleep(100);
        }
    }

    private static String spaces(int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += " ";
        }
        return result;
    }
}
