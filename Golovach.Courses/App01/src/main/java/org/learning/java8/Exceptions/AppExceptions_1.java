package org.learning.java8.Exceptions;

import java.io.IOException;

public class AppExceptions_1 {
    public static void main(String[] args) throws IOException {
        try {
            int area = area(-10, 20);
            System.out.println(area);
        } catch (IllegalArgumentException e) {
            System.out.println("Bad ...");
        }
        System.out.println("next");
    }

    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("a < 0 || b < 0 == true");
        }
        return width * height;
    }
}
