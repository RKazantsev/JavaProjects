package org.learning.java8.ArraysSortSearch;

public class ArrayInvertRec {

    public static void invert(int[] data, int k) {

        if (k < data.length / 2) {

            int tmp = data[k];
            data[k] = data[data.length - 1 - k];
            data[data.length - 1 - k] = tmp;

            invert(data, k + 1);
        }
    }
}
