package org.learning.java8.Memory;

public class RefByValue {

//    static int x;

    public static Object[] refer;

    public static void main(String[] args) {
//////////
//        int x = 0;
//        int y = x;
//        x = 1;
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);
//////////
//        int[] x = {0, 1, 2};
//        int[] y = x;
//        x = null;
//        System.out.println("x: " + Arrays.toString(x));
//        System.out.println("y: " + Arrays.toString(y));
//////////
//        IntHolder x = new IntHolder(0);
//        IntHolder y = x;
//        x.value = 1;
//        System.out.println("x: " + x.value);
//        System.out.println("y: " + y.value);
//////////
//        long y;
//        y = System.currentTimeMillis();
//        System.out.println("x: " + x);
//        System.out.println("y: " + y);
////////// f(x )# 1
//        IntHolder x = new IntHolder(0);
//        x = f(x);
//        System.out.println("x.value: " + x.value);
////////// f(x )# 2
//        int[] x = {0, 1, 2};
//        x = f(x);
//        System.out.println("x: " + Arrays.toString(x));
////////// f(x )# 3
//        IntHolder x = new IntHolder(0);
//        f(x);
//        System.out.println("x.value: " + x.value);

//        Object[] ref = new Object[1];
//        while (true) {
//            Object[] a = new Object[1];
//            Object[] b = new Object[1];
//            a[0] = b;
//            b[0] = a;
//            ref[0] = a;
//            new Object();
//        }

//        Object[] ref = new Object[1];
//        while (true) {
//            ref = new Object[]{ref, new byte[1_000_000]};
//        }

//        Object[] ref = new Object[1];
//        while(true) {
//            ref[0] = new Object[1];
//            ref = (Object[])ref[0];
//        }

//        Object[] ref = new Object[1];
//        while (true) {
//            Object[] a = new Object[1];
//            Object[] b = {a};
//            ref[0] = new Object[]{a, b, ref};
//        }

//        int index = 0;
//        while (true) {
//            new MyClass(index++);
//        }
////////f(x )# 4
//        f();
////////
//        System.out.println(new Product().id);
//        System.out.println(new Product().id);
//        System.out.println(new Product().id);
//        System.out.println(new Product().id);
//        System.out.println(new Product().id);
//        System.out.println(new Product().id);
        Product p0 = new Product();
        System.out.println(Product.counter);
        Product p1 = new Product();
        System.out.println(Product.counter);
        Product p2 = new Product();
        System.out.println(Product.counter);
        System.out.println("-----");
        System.out.println(p0.counter);
        System.out.println(p1.counter);
        System.out.println(p1.counter);
        System.out.println("-----");
        p0 = p1 = p2 = null;
        Product p4 = new Product();
        System.out.println(p4.counter);

        Class clazz = p4.getClass();
        ClassLoader cl = clazz.getClassLoader();
        System.out.println(clazz.toString());
        System.out.println(cl.toString());
        System.out.println(cl.getParent().toString());

        String s = "Hello!";

        System.out.println(g(s));
    }

    public static String g(String k) {
        return k.toUpperCase();
    }

////////// #1
//    public static IntHolder f(IntHolder x) {
//        return new IntHolder(x.value + 1);
//    }
////////// #2
//    public static int[] f(int[] x) {
//        return new int[]{x[0] + 10, x[1] + 10, x[2] + 10};
//    }
////////// #3
//    public static void f(IntHolder x) {
//        x = new IntHolder(1);
//    }
//////// #4
//    public static void f() {
//        int f = 0;
//        int k = f;
//        f = 100;
//        System.out.println(k);
//
//        String s = "";
//
//        System.out.println(s);
//    }



}

class Product {
    static int counter = 0;
    final int id = counter++;
}

//class MyClass {
//    private int index;
//    private byte[] array = new byte[1_000_000];
//
//    public MyClass(int index) {
//        this.index = index;
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
////        RefByValue.refer = new Object[] {this, RefByValue.refer};
//        System.out.println(index);
////        while (true);
//    }
//}
