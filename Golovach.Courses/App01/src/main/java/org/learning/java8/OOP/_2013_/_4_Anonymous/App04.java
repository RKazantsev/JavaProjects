package org.learning.java8.OOP._2013_._4_Anonymous;


class Y {
    public Runnable f() {
        int p = 20;
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(p); // ПЕРЕДАЮТ FINAL переменную скрытым способом, и она хранится после удаления фрейма метода f()
            }
        };
    }
}

public class App04 {
    public static void main(String[] args) {
        Runnable r = new Y().f();
        r.run(); // System.out.println(p) - запускается здесь, когда локальной переменной не должно существовать
    }
}
