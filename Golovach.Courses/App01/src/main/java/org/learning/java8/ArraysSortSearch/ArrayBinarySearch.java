package org.learning.java8.ArraysSortSearch;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 10));
        System.out.println(Arrays.binarySearch(arr, 15));
        System.out.println(Arrays.binarySearch(arr, 20));
        System.out.println(Arrays.binarySearch(arr, 25));
        System.out.println(Arrays.binarySearch(arr, 30));
        System.out.println(Arrays.binarySearch(arr, 35));
        System.out.println(Arrays.binarySearch(arr, 40));
        System.out.println(Arrays.binarySearch(arr, 45));

        int low = 2_147_483_647;
        int high = 2_147_483_647;
        int mid = (low + high) >>> 1;

        int low1 = 2_000_000_000;
        int high1 = 1_500_000_000;
        int mid1 = (low1 + high1) >>> 1;

        int n = -2_147_483_648;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(n >> 1));
        System.out.println("0" + Integer.toBinaryString(n >>> 1));
        System.out.println(n >>> 1);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("0" + Integer.toBinaryString(low));
        System.out.println("0" + Integer.toBinaryString(high));
        System.out.println(Integer.toBinaryString(low + high));
        System.out.println(low + high);


        System.out.println("mid = " + mid1);
        System.out.println("0" + Integer.toBinaryString(mid1));
        System.out.println("12345678123456781234567812345678");
        System.out.println(Integer.toBinaryString(-1));


    }
}
