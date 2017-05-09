package org.learning.java8.Collections.App16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App16_2_TestListGet {

    static int LIST_LENGTH = 100_000;
    static int OPERATION_COUNT = 100_000;

    public static void main(String[] args) {


        int elemIndex = LIST_LENGTH / 2;
//        int elemIndex = 0;

//        List<String> list = new LinkedList<>();
        List<String> list = new ArrayList<>();

        // FILL
        for (int k = 0; k < LIST_LENGTH; k++) {
            list.add("A");
        }

        //TEST
        long startTime = System.currentTimeMillis();
        for (int k = 0; k < OPERATION_COUNT; k++) {
            list.get(elemIndex);
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("dT: " + (stopTime - startTime));

    }
}
