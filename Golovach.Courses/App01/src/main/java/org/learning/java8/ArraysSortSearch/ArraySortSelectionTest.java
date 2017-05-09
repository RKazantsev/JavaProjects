package org.learning.java8.ArraysSortSearch;

import java.util.Random;

public class ArraySortSelectionTest {
    public static void main(String[] args) {

        int[] array = new int[128 * 1024];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }

        long t0 = System.nanoTime();
        ArraySortSelection.sortSelection(array);
        System.out.println("Q: " + (System.nanoTime() - t0) / 1_000_000);

//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt();
//        }
//
//        long t1 = System.nanoTime();
//        sortSelectionOptimized(array);
//        System.out.println("Q: " + (System.nanoTime() - t1) / 1_000_000);
//
//        int[][] data = {
//                {},
//                {1},
//                {2, 0},
//                {5, 6, 3},
//                {5, 4, 1, 0},
//                {100, 34, 2, 123, 4, 7, 8, 7, 100}
//        };
//        for (int[] arr: data) {
//            System.out.print(Arrays.toString(arr) + " -> ");
//            sortSelection(arr);
//            System.out.println(Arrays.toString(arr));
//        }
//        for (int[] arr: data) {
//            System.out.print(Arrays.toString(arr) + " -> ");
//            sortSelectionOptimized(arr);
//            System.out.println(Arrays.toString(arr));
//        }
    }
}
