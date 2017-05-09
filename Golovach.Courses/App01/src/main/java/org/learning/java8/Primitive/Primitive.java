package org.learning.java8.Primitive;

import static java.lang.Double.NaN;

public class Primitive {
    public static void main(String[] args) {

        int i = 0;
        for ( ; i < 10 ; i +=2) {
            System.out.println(i + " ");
        }

        do {
            System.out.println(i + " ");

            i++;
            if (i < 15)
                continue;
            else
                break;
        } while (i < 20);


        switch (i) {
            case 20:
                System.out.println("case 20");
            case 22:
                System.out.println("case 22");
                break;
            case 24:
                System.out.println("case 24");
            default:
                System.out.println("def");

        }

        int x1 = 1500000000;
        int x2 = 1500000000;

        System.out.println(x1 + x2);

        for (int j = 0; j < 10; j++) {
            System.out.println(j + " % 2 = " + (j % 2f));
            System.out.println(j + " /2 = " + (j / 2f));
            System.out.println();

        }

        String str = "NaN";
        double d = Double.valueOf(str);
        System.out.println(d * 2);

        System.out.println(d == Double.POSITIVE_INFINITY);
        System.out.println(d > Double.POSITIVE_INFINITY);
        System.out.println(d < Double.POSITIVE_INFINITY);

        if (d == NaN)
            System.out.println("Y");
        else
            System.out.println("N");

        int[] a = new int[0];
        int[] b = null;
    }
}
