package org.learning.java8.Exceptions.TryWithResourcesPractice.Labs;

public class TwoTWR {
    public static void call(AutoCloseableFactory factoryA,
                            AutoCloseableFactory factoryB,
                            TryBody body) throws Throwable {

        try (AutoCloseable resourceA = factoryA.create();
             AutoCloseable resourceB = factoryB.create()) {

            body.runBody();
        }
    }
}
