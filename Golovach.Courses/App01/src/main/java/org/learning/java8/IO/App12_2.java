package org.learning.java8.IO;

// Example: Implementing a Decorator pattern via class method.

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class App12_2 {
    public static void main(String[] args) {
        List list = new ArrayList(); // OK
        //List list = checkedList(new ArrayList(), String.class);// Exception in thread "main" java.lang.ClassCastException:
                                                                // Attempt to insert class java.lang.Integer element into
                                                                // collection with element type class java.lang.String

        list.add("Hello");
        list.add(1);

    }
}
