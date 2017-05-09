package org.learning.java8.ArraysSortSearch;

import java.util.Random;

public class ArraySortInsertionTest {
    public static void main(String[] args) {

        int[] array = new int[1000001];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt() % 300;
        }

        long t0 = System.nanoTime();
        ArraySortInsertion.sortInsertion(array);
        System.out.println("Insertion: " + (System.nanoTime() - t0) / 1_000_000);

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt() % 300;
        }

        long t5 = System.nanoTime();
        ArraySortInsertion.sortInsertionOptimized(array);
        System.out.println("Insertion Optimized: " + (System.nanoTime() - t5) / 1_000_000);
//        System.out.println(Arrays.toString(array));

//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt();
//        }
//
//        long t1 = System.nanoTime();
//        sortSelection(array);
//        System.out.println("Selection: " + (System.nanoTime() - t1) / 1_000_000);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt();
//        }
//
//        long t2 = System.nanoTime();
//        sortSelectionOptimized(array);
//        System.out.println("Selection Optimized: " + (System.nanoTime() - t2) / 1_000_000);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt();
//        }
//
//        long t3 = System.nanoTime();
//        sortBubbleAscending(array);
//        System.out.println("Bubble Ascending: " + (System.nanoTime() - t3) / 1_000_000);
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt();
//        }
//
//        long t4 = System.nanoTime();
//        sortBubbleDescending(array);
//        System.out.println("Bubble Descending: " + (System.nanoTime() - t4) / 1_000_000);


//        int[][] data = {
//                {},
//                {1},
//                {2, 0},
//                {5, 6, 3},
//                {5, 4, 1, 0},
//                {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}
//        };
//        for (int[] array: data) {
//            System.out.print(Arrays.toString(array) + " -> ");
//            sortInsertion(array);
//            System.out.println(Arrays.toString(array));
//        }
//        for (int[] array: data) {
//            System.out.print(Arrays.toString(array) + " -> ");
//            sortInsertionOptimized(array);
//            System.out.println(Arrays.toString(array));
//        }
//
//        int[] arr0 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(Arrays.toString(arr0));
//        System.arraycopy(arr0, 1, arr0, 3, 3);
//        System.out.println(Arrays.toString(arr0));
//



    }
}
