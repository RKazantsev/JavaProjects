package org.learning.java8.Collections;

import java.util.ArrayList;

public class App11 {
    public static void main(String[] args) {

        // Object[] ref = new String[] {"Mike", "Ann"}; // ковариантность
        //ArrayList<Object> ref2 = new ArrayList<String>(); // инвариантность


        String[] strArr = {"Mike"};
        Object[] objArr = strArr;
        objArr[0] = new int[] {10, 20, 30};
        System.out.println(strArr[0]);


        ArrayList<? extends Number> ref = new ArrayList<Integer>();
        Number n = null;
//        ref.add(n);
        Number xxx = ref.get(0);


        ArrayList<? extends Integer> ref0 = null;
        ArrayList<? extends  Number> ref1 = null;
//        ref0 = ref1;
        ref1 = ref0;

        ArrayList<? super Integer> ref3 = null;
        ArrayList<? super  Number> ref4 = null;
        ref3 = ref4;
//        ref4 = ref3;


    }
}
