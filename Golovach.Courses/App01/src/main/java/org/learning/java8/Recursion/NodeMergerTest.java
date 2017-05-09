package org.learning.java8.Recursion;

public class NodeMergerTest {

    public static void main(String[] args) {

//        Node tail = generateIteration(0, 1, 2, 3);
//        Node tailRec = create(0, 1, 2, 3);
//        Node tailRecFull = generateRecursionFull(0, 1, 2, 3);
//
//        System.out.println(toStringIteration(tail));
//        System.out.println(toString(tail));
//
//        System.out.println(toStringIteration(tailRec));
//        System.out.println(Node.toString(tailRec));
//
//        System.out.println(toStringIteration(tailRecFull));
//        System.out.println(toString(tailRecFull));

        Node tailA = Node.create(10, 20 ,30, 40);

        Node tailB = Node.create(25, 25 ,30, 45);
        System.out.println(Node.toString(tailA));
        System.out.println(Node.toString(tailB));//
        System.out.println(Node.toString(Node.merge(tailA, tailB)));//
        Node copyTail = Node.copy(tailA);
        System.out.println(Node.toString(copyTail));//
        System.out.println(Node.isEqual(tailA, copyTail));//
        System.out.println(Node.isEqual(tailA, tailB));

    }


}
