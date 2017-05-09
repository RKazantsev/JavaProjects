package org.learning.java8.ArraysSortSearch;

import java.util.Random;

public class ArraySortBubbleTest {
    public static void main(String[] args) {

        int[] array = new int[64 * 1024];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }

        long t0 = System.nanoTime();
        ArraySortBubble.sortBubbleDescending(array);
        System.out.println("Q: " + (System.nanoTime() - t0) / 1_000_000);
//        System.out.println(Arrays.toString(array));

//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt();
//        }

        long t1 = System.nanoTime();
        ArraySortBubble.sortBubbleAscending(array);
        System.out.println("Q: " + (System.nanoTime() - t1) / 1_000_000);
//        System.out.println(Arrays.toString(array));

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
//            sortInsertion(arr);
//            System.out.println(Arrays.toString(arr));
//        }
//        for (int[] arr: data) {
//            System.out.print(Arrays.toString(arr) + " -> ");
//            sortInsertionOptimized(arr);
//            System.out.println(Arrays.toString(arr));
//        }
    }
}
