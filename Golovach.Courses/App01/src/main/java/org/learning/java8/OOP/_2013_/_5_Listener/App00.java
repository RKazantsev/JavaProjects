package org.learning.java8.OOP._2013_._5_Listener;

import javax.swing.event.*;
import java.awt.event.*;
import java.util.*;

public class App00 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>() {
            @Override
            public String toString() {
                return "Hello!";
            }
        };
        System.out.println(list);
        System.out.println(list.getClass());
    }
}

class BaseMouseInputListener implements MouseInputListener {

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
