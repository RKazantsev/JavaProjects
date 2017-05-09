package org.learning.java8.Exceptions.TryWithResourcesPractice.Labs;

public class ThreeImpl {
    public static void call (AutoCloseableFactory factoryA,
                             AutoCloseableFactory factoryB,
                             AutoCloseableFactory factoryC,
                             TryBody body) throws Throwable {
//---------------------
        // Create A
        AutoCloseable resourceA = factoryA.create();
//-------------------------
        //Create B
        AutoCloseable resourceB;
        try {
            resourceB = factoryB.create();
        } catch (Throwable createBEx) {
            //Close A
            try {
                resourceA.close();
            } catch (Throwable closeAEx) {
                createBEx.addSuppressed(closeAEx);
            }
            throw createBEx;
        }
//-------------------------
        //Create C
        AutoCloseable resourceC;
        try {
            resourceC = factoryC.create();
        } catch (Throwable createCEx) {
            //Close B
            try {
                resourceB.close();
            } catch (Throwable closeBEx) {
                createCEx.addSuppressed(closeBEx);
                //Close A
                try {
                    resourceA.close();
                } catch (Throwable closeAEx) {
                    createCEx.addSuppressed(closeAEx);
                }
                throw createCEx;
            }
            // Close A
            try {
                resourceA.close();
            } catch (Throwable closeAEx) {
                createCEx.addSuppressed(closeAEx);
            }
            throw createCEx;
        }
//--------------------------
        // Run Body
        try {
            body.runBody();
        } catch (Throwable bodyEx) {
            // Close C
            try {
                resourceC.close();
            } catch (Throwable closeCEx) {
                bodyEx.addSuppressed(closeCEx);
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
                bodyEx.addSuppressed(closeBEx);
                //Close A
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
//------------------------------
        //Close C, Close B, Close A
        try {
            resourceC.close();
        } catch (Throwable closeCEx) {
            // Close B
            try {
                resourceB.close();
            } catch (Throwable closeBEx) {
                closeCEx.addSuppressed(closeBEx);
                // Close A
                try {
                    resourceA.close();
                } catch (Throwable closeAEx) {
                    closeCEx.addSuppressed(closeAEx);
                }
                throw closeCEx;
            }
            // Close A
            try {
                resourceA.close();
            } catch (Throwable closeAEx) {
                closeCEx.addSuppressed(closeAEx);
            }
            throw closeCEx;
        }
        // Close B, Close A
        try {
            resourceB.close();
        } catch (Throwable closeBEx) {
            //Close A
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
