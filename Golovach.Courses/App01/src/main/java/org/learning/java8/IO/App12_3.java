package org.learning.java8.IO;

import java.io.*;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class App12_3 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream buff = new ByteArrayOutputStream();
        OutputStream dst = new BufferedOutputStream(buff, 8 * 1024);
        dst = new GZIPOutputStream(dst);
//        dst = new DeflaterOutputStream(dst);
        DataOutput out = new DataOutputStream(dst);


        // Compressing data
        for (int k = 0; k < 1_000_000; k++) {
            out.writeDouble(k % 2 == 0 ? 0.5 : 1.5);
        }
        dst.flush();
        dst.close();
        byte[] rawData = buff.toByteArray();
        System.out.println(rawData.length);


        // Decompressing data
        DataInput src = new DataInputStream(
                new GZIPInputStream(
                        new BufferedInputStream(
                                new ByteArrayInputStream(rawData))));
        System.out.println(src.readDouble());
        System.out.println(src.readDouble());
        System.out.println(src.readDouble());
        System.out.println(src.readDouble());
        System.out.println(src.readInt()); // после сжатия double получили байты, после распаковки получаем тоже байты и можно
                                           // интерпретировать данные в другом произвольном типе. Слабая типизация.
        System.out.println(";" + src.readUTF() + ";");



//        System.out.println(Double.doubleToLongBits(1.0)); //  слабая типизация \ преобразование
//        System.out.println((long) 1.5); // сильная типизация
    }
}
