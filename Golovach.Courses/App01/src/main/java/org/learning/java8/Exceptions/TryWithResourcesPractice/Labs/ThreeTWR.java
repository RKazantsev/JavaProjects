package org.learning.java8.Exceptions.TryWithResourcesPractice.Labs;

public class ThreeTWR {
    public static void call(AutoCloseableFactory factoryA,
                            AutoCloseableFactory factoryB,
                            AutoCloseableFactory factoryC,
                            TryBody body) throws Throwable {

        try (AutoCloseable resourceA = factoryA.create();
             AutoCloseable resourceB = factoryB.create();
             AutoCloseable resourceC = factoryC.create()) {

            body.runBody();
        }
    }
}
