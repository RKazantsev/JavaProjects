package org.learning.java8.Exceptions.TryWithResourcesPractice.Labs;

public class TwoImpl {
    public static void call(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB,
                            TryBody body) throws Throwable {
        // Create A
        AutoCloseable resourceA = factoryA.create();

        // Create B
        AutoCloseable resourceB;
        try {
            resourceB = factoryB.create();
        } catch (Throwable createBEx) {
            // Close A
            try {
                resourceA.close();
            } catch (Throwable closeAEx) {
                createBEx.addSuppressed(closeAEx);
            }
            throw createBEx;
        }
        // Run body
        try {
            body.runBody();
        } catch (Throwable bodyEx) {
            // Close B
            try {
                resourceB.close();
            } catch (Throwable closeBEx) {
                bodyEx.addSuppressed(closeBEx);
                // Close A
                try {
                    resourceA.close();
                } catch (Throwable closeAEx) {
                    bodyEx.addSuppressed(closeAEx);
                }
                throw bodyEx;
            }
            // Close A
            try {
                resourceA.close();
            } catch (Throwable closeAEx) {
                bodyEx.addSuppressed(closeAEx);
            }
            throw bodyEx;
        }
        // Close B, Close A
        try {
            resourceB.close();
        } catch (Throwable closeBEx) {
            try {
                resourceA.close();
            } catch (Throwable closeAEx) {
                closeBEx.addSuppressed(closeAEx);
            }
            throw closeBEx;
        }
        resourceA.close();
    }
}
