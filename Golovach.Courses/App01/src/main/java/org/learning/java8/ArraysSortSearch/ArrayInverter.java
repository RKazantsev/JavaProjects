package org.learning.java8.ArraysSortSearch;

import java.util.Arrays;

public class ArrayInverter {
    public  static void invert(int[] data) {
        for (int i = data.length / 2 - 1; i >= 0; i--) {
            int tmp = data[i];
            data[i] = data[(data.length - 1) - i];
            data[(data.length - 1) - i] = tmp;
        }
    }
}