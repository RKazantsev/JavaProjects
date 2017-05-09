package org.learning.java8.OOP._2013_._5_Listener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mouse {

    static List<MouseListener> listeners = new ArrayList<>();

  /*  static {
        Random rnd = new Random();
        new Thread(() -> {
            while (true) {
                click(rnd.nextInt(1000), rnd.nextInt(1000));
            }
        }).start();
    }*/

    public static void click(int x, int y) {
        for (MouseListener listener: listeners) {
            listener.mouseClicked(x, y);
        }
    }

    public static void addListener(MouseListener listener) {
        listeners.add(listener);
    }
}
