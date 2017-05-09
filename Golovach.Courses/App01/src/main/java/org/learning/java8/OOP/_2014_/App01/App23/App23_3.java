package org.learning.java8.OOP._2014_.App01.App23;

public class App23_3 {

    public App23_3() {
        System.out.println("App23_3 has been created!");
    }

    static public class Nested { // со static - это всегда static nested class, без static - inner class

    }
}

class Test2 {
    public static void main(String[] args) {
        //App23_3 ref0 = new App23_3();
        App23_3.Nested ref1 = new App23_3.Nested(); // Экземпляр App23_3 не создается, это просто часть имени класса Nested
    }
}