package org.learning.java8.Exceptions;

public class AppExceptions_5 {
    public static void main(String[] args) {
        System.err.println(0);
        try {
            throw new RuntimeException();
        } catch (Error e) {
            System.err.println("Error");
        } catch (RuntimeException e) {
            System.err.println("RTE");
        } catch (Exception e) {
            System.err.println("Exception");
        }
    }
}
