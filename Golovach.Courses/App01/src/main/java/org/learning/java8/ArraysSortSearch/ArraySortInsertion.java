package org.learning.java8.ArraysSortSearch;

// Insertion Sort (iteration)

import java.util.Arrays;

class ArraySortInsertion {

    static void sortInsertion(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int keyElement = arr[barrier];
            int location = barrier - 1;
            while (location >= 0 && arr[location] > keyElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = keyElement;
        }
    }

    static void sortInsertionOptimized(int[] arr) {

        int barrier = 1;
        while ((barrier + 10) <= arr.length) {

            int keyElement = arr[barrier];
            int location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

            keyElement = arr[barrier];
            location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

            keyElement = arr[barrier];
            location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

            keyElement = arr[barrier];
            location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

            keyElement = arr[barrier];
            location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

            keyElement = arr[barrier];
            location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

            keyElement = arr[barrier];
            location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

            keyElement = arr[barrier];
            location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

            keyElement = arr[barrier];
            location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

            keyElement = arr[barrier];
            location = Arrays.binarySearch(arr, 0, barrier, keyElement);
            location = location >= 0 ? location : - (location + 1);
            System.arraycopy(arr, location, arr, location + 1, barrier - location);
            arr[location] = keyElement;

            barrier++;

        }
    }
}
