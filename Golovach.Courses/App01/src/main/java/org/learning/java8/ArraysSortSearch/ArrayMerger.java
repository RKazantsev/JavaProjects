package org.learning.java8.ArraysSortSearch;

class ArrayMerger {

    static int[] merge (int[] A, int[] B) {

        int indexA = 0;
        int indexB = 0;

        int[] C = new int[A.length + B.length];

        while ((indexA <= A.length - 1) & (indexB <= B.length - 1)) {

            if (A[indexA] <= B[indexB]) {

                C[indexA + indexB] = A[indexA++];
            }
            else {

                C[indexA + indexB] = B[indexB++];
            }

            if (indexA == A.length) {

                System.arraycopy(B, indexB, C, indexA + indexB, B.length - indexB);
            }

            if (indexB == B.length) {

                System.arraycopy(A, indexA, C, indexA + indexB, A.length - indexA);
            }
        }

        return C;
    }
}
