package org.learning.java8.Recursion;

import java.util.Arrays;

class PermuteArray {

    static void permute(int[] data, int dataLength) {

        if (dataLength < 2) {
            System.out.println(Arrays.toString(data));
        } else {
            for (int i = 0; i < dataLength; i++) {
                swap(data, i, dataLength - 1);
                permute(data, dataLength - 1);
                swap(data, i, dataLength - 1);
            }
        }
    }

    private static void swap(int[] data, int firstIndex, int secondIndex) {
        int tmp = data[firstIndex];
        data[firstIndex] = data[secondIndex];
        data[secondIndex] = tmp;
    }
}
