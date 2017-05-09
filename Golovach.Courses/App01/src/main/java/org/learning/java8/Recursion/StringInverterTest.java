package org.learning.java8.Recursion;

import org.learning.java8.ArraysSortSearch.ArrayInverterRec;

import java.util.Arrays;

public class StringInverterTest {
    public static void main(String[] args) {
        testStringInvert("");
        testStringInvert("12");
        testStringInvert("Hello World!");

//        testInvertRec(new int[]{});
//        testInvertRec(new int[]{0});
//        testInvertRec(new int[]{0, 1});
//        testInvertRec(new int[]{0, 1, 2, 3, 4});
    }

    public static  void testStringInvert(String arg) {
        System.out.print(arg + " -> ");
        System.out.println(StringInverter.invert(arg));
    }

    public static void testInvertRec(int[] arr) {
        System.out.print(Arrays.toString(arr) + " -> ");
        ArrayInverterRec.invertRec(arr, arr.length / 2 - 1);
        System.out.println(Arrays.toString(arr));
    }
}
