package org.learning.java8.ArraysSortSearch;

// Selection Sort (iteration)

class ArraySortSelection {

    static void sortSelection(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }

    static void sortSelectionOptimized(int[] arr) {

        for (int barrier = 0; barrier < arr.length - 1; barrier++) {

            int keyElement = arr[barrier];
            int keyIndex = barrier;
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[index] < keyElement) {
                    keyIndex = index;
                    keyElement = arr[keyIndex];
                }
            }
            if (keyIndex != barrier) {
                int tmp = arr[barrier];
                arr[barrier] = arr[keyIndex];
                arr[keyIndex] = tmp;
            }
        }
    }
}
