package org.learning.java8.OOP._2013_._6_Patterns;


// Постановка вопроса: зачем нам в синглтоне использовать synchronized, если создается только 1 объект.
// Слишком дорого получается, его используют.
// Предлагается решение ниже, но оно не верно, никогда так не делать!!!

public class DoubleCheckedLocking {
    private static DoubleCheckedLocking instance = null;

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {                            // дешевый if, в среднем 1 такт процессора
            synchronized (DoubleCheckedLocking.class) {    // в сотни раз дороже, чем if
                if (instance == null)
                    instance = new DoubleCheckedLocking();
            }
        }
        return instance; // при многопоточности может вернуть инстанс, конструктор которого не закончил работу
    }
}
