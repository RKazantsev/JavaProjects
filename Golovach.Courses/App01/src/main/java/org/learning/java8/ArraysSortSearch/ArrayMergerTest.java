package org.learning.java8.ArraysSortSearch;

public class ArrayMergerTest {

    public static void main(String[] args) {

        int[] A = new int[10000001];
        int[] B = new int[10000001];

        for (int i = 0; i < A.length; i++) {

            A[i] = 2 * i;
            B[i] = 3 * i;
        }

        long t = System.nanoTime();

        int[] C = ArrayMerger.merge(A, B);

        System.out.println("Time = " + (System.nanoTime() - t) / 1_000_000_000d);
    }
}
