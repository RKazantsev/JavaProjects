package org.learning.java8.IO;

public class App09 {
    public static void main(String[] args) {

        String str0 = "\uFF6E\uFF6E";
        String str2 = "Adam \uFF6ENorvere"; // Специальный символ можно вставить в строку
        String str1 = new String(new char[] {0xFF6E, 0xFF6E}); // Аналогично str0
        System.out.println(str0);
        System.out.println(str1);
        System.out.println(str2);

        printChar();
        printShort();
    }

    private static void printChar() {
        int c0 = 0xFFFF;
        char c1 = '\uFFFF';
        System.out.println((int) c0);
        System.out.println((int) c1);
    }

    private static void printShort() {
        short s = -32768; // Short.MIN_VALUE
        System.out.println(Integer.toBinaryString(s));
    }
}
