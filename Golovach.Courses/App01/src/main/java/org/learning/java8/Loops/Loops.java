package org.learning.java8.Loops;

import static java.lang.StrictMath.abs;

public class Loops {
    public static void main(String[] args) {
        int length = 15;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(((i <= j) && (i + j < length)) || ((i >= j) && (i + j > length - 2)) ? "+" : " " );
            }
            for (int j = 0; j < length; j++) {
                System.out.print(((i < j) && (i + j < length - 1)) || ((i > j) && (i + j > length - 1)) ? " " : "+" );
            }
            System.out.println();
        }

        int[] arr = {0, 10, 20, 30, 40};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
