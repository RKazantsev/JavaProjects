package org.learning.java8.Exceptions.TryWithResourcesPractice.Labs;

public class OneImpl {

    public static void call(AutoCloseableFactory factory, TryBody body) throws Throwable {

        AutoCloseable resource = factory.create();

        try {
            body.runBody();
        } catch (Throwable bodyEx) {
            try {
                resource.close();
            } catch (Throwable closeEx) {
                bodyEx.addSuppressed(closeEx);
            }
            throw bodyEx;
        }
        resource.close();
    }


}
