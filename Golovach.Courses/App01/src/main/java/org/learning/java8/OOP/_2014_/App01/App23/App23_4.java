package org.learning.java8.OOP._2014_.App01.App23;

public class App23_4 {

    static int k;

    static public class Inner {
        public void f() {
            System.out.println(k);
        }
    }
}

class Test3 {
    public static void main(String[] args) {

        System.out.println(App23_4.k);

//        App23_4 ref0 = new App23_4();
//        App23_4.Inner ref1 = new App23_4.Inner();
//        App23_4.Inner ref1 = ref0.new Inner();
//        App23_4.Inner ref2 = ref0.new Inner();
//        App23_4.Inner ref3 = ref0.new Inner();

//        // 2 outer classes with a 3 inner classes that are linked to outer class
//        App23_4 base0 = new App23_4();
//        App23_4.Inner in0 = base0.new Inner();
//        App23_4.Inner in1 = base0.new Inner();
//        App23_4.Inner in2 = base0.new Inner();
//
//        App23_4 base1 = new App23_4();
//        App23_4.Inner in10 = base1.new Inner();
//        App23_4.Inner in20 = base1.new Inner();
//        App23_4.Inner in30 = base1.new Inner();
    }
}
