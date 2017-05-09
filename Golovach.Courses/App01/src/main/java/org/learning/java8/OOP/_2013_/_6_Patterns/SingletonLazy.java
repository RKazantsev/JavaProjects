package org.learning.java8.OOP._2013_._6_Patterns;

class SingletonEarly { // Ранняя загрузка
    public static final double PI = 3.1415926535;
    static final SingletonEarly instance = new SingletonEarly();
    private SingletonEarly() {}
}

class SingletonLazy { // Ленивая загрузка
    private static SingletonLazy instance;
    private SingletonLazy() {}

    public static synchronized SingletonLazy getInstance() { // синхронизируемся по SingletonLazy.class
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

class Demo {
    public static void main(String[] args) {

        System.out.println(SingletonEarly.PI); // Поскольку идет обращение к полю, то класс SingletonEarly загружен,
        // инициализирован, все static поля созданы в памяти.

        SingletonEarly ref = SingletonEarly.instance;
        System.out.println(ref);

        SingletonLazy ref1 = SingletonLazy.getInstance(); // Класс не загружается и не инициализируется пока явно
        // не вызовем его метод getInstance().
        System.out.println(ref1);

    }
}