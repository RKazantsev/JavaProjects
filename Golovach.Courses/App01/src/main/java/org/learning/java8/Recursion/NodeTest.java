package org.learning.java8.Recursion;

import java.util.LinkedList;

public class NodeTest {

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        l.remove(6);

        Node.checkEquals(Node.toString(Node.create(0)), Node.toString(Node.addLast(null, 0)));
        Node.checkEquals(Node.toString(Node.create(1, 0)), Node.toString(Node.addLast(Node.create(1), 0)));
        Node.checkEquals(Node.toString(Node.create(1, 2, 0)), Node.toString(Node.addLast(Node.create(1, 2), 0)));
        Node.checkEquals(Node.toString(Node.create(1, 2, 3, 0)), Node.toString(Node.addLast(Node.create(1, 2, 3), 0)));
        Node.checkEquals(Node.toString(Node.create(1, 2, 3, 4, 0)), Node.toString(Node.addLast(Node.create(1, 2, 3, 4), 0)));
        Node.checkEquals(Node.toString(Node.create(1, 2, 3, 4, 5, 0)), Node.toString(Node.addLast(Node.create(1, 2, 3, 4, 5), 0)));

    }
}