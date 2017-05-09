package org.learning.java8.Recursion;

import static java.util.Arrays.copyOfRange;

public class Node {

    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

//    public static Node generateIteration(int... values) {
//        Node tail = null;
//        for (int k = values.length -1; k >=0; k--) {
//            tail = new Node(values[k], tail);
//        }
//        return tail;
//    }

    public static Node create(int... v) {

        return v.length == 0 ? null : new Node(v[0], create(copyOfRange(v, 1, v.length)));
    }

//    public static Node generateRecursionFull(int... v) {
//        if (v.length == 0) {
//            return null;
//        } else {
//            int[] newArray = Arrays.copyOfRange(v, 1, v.length);
//            Node next = generateRecursionFull(newArray);
//            return new Node(v[0], next);
//        }
//    }

//    public static String toStringIteration(Node tail) {
//        String result = "";
//        while (tail != null) {
//            result += tail.value + " -> ";
//            tail = tail.next;
//        }
//        return result + "*";
//    }

    public static String toString(Node tail) {
        return (tail == null) ? "*" : tail.value + " -> " + toString(tail.next);
    }

    public static Node merge(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            if (tailA.value < tailB.value) {
                return new Node(tailA.value, merge(tailA.next, tailB));
            } else {
                return new Node(tailB.value, merge(tailA, tailB.next));
            }
        } else {
            return (tailA == null) ? tailB : tailA;
        }
    }

    public static Node copy(Node tail) {
        return (tail == null) ? null : new Node(tail.value, copy(tail.next));
    }

    public static boolean isEqual(Node tailA, Node tailB) {
        if (tailA != null && tailB != null) {
            return (tailA.value == tailB.value) && isEqual(tailA.next, tailB.next);
        } else {
            return tailA == tailB;
        }
    }

    public static Node addLast(Node tail, int value) {

        if (tail == null) {
            return new Node(value, null);
        } else if (tail.next != null) {
            addLast(tail.next, value);
            return tail;
        } else {
            tail.next = new Node(value, null);
            return tail;
        }
    }

    public static Node insertInPosition(Node tail, int index, int value) {

        return null;
    }

    public static Node removeInPosition(Node tail, int index) {

        return null;
    }

    public static Node removeLast(Node tail) {

        return null;
    }

    public static boolean isGrowing(Node tail, int startValue) {

        return true;
    }



    public static void checkEquals(String expected, String actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("expected = '" + expected + "' but actual = '" + actual + "'");
        }
    }

}
