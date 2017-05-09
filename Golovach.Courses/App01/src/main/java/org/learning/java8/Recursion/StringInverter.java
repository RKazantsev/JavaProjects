package org.learning.java8.Recursion;

public class StringInverter{
    public static String invert(String str) {
        char[] data = str.toCharArray();
        for (int i = data.length / 2 - 1; i >= 0; i--) {
            char tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }

        return new String(data);
    }
}
