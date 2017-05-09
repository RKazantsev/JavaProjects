package org.learning.java8.ArraysSortSearch;

public class ArrayInverterRec {
    public static void invertRec(int[] data, int i) {
        if (i >= 0) {
            int tmp = data[i];
            data[i] = data[(data.length - 1) - i];
            data[(data.length - 1) - i] = tmp;
            invertRec(data, i - 1);
        }
    }
}
