package org.learning.java8.ArraysSortSearch;

import java.util.Arrays;

public class ArrayInvertRecTest {

    public static void main(String[] args) {

        testInvert(new int[]{});
        testInvert(new int[]{0});
        testInvert(new int[]{0, 1});
        testInvert(new int[]{0, 1, 2, 3, 4});
    }

    private static void testInvert(int[] arr) {

        System.out.print(Arrays.toString(arr) + " -> ");
        ArrayInvertRec.invert(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}

