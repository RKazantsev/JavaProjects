package org.learning.java8.IO;

import java.util.Arrays;

public class App10_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(convertUTF8toCodePoint("R".getBytes())));
    }

    public static int[] convertUTF8toCodePoint (byte[] utf8) {
        int[] result = new int[utf8.length];
        int posIn = 0;
        int posOut = 0;
        while (posIn < utf8.length) {
            byte octet0 = utf8[posIn++];
            if ((octet0 & 0b1000_0000) == 0) {
                result[posOut++] = octet0;
            } else {
                byte octet1 = utf8[posIn++];
                result[posOut++] = ((octet0 & 0b00011111) << 3);
            }
        }
        return Arrays.copyOfRange(result, 0, posOut);
    }
}
