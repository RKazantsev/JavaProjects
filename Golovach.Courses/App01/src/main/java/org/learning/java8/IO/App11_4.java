package org.learning.java8.IO;

import java.io.*;
import java.net.URL;


// ЗАДАЧА С КОНЕЧНЫМ АВТОМАТОМ Lection#11 Part#5

public class App11_4 {
    public static void main(String[] args) throws IOException {

        final int BUFF_LEN = 4;
        FileInputStream in = new FileInputStream("d:/tmp/input.txt");
        FileOutputStream out = new FileOutputStream("d:/tmp/output.txt");

        filter(in, out, BUFF_LEN);

    }

    public static void filter(InputStream in, OutputStream out, int buffSize) throws IOException {

        final int ZERO_STATE = 0;
        final int NON_ZERO_STATE = 1;
        byte[] buff = new byte[buffSize];
        int count;

        while ((count = in.read(buff)) != -1) {
            int state = ZERO_STATE;
            for (int index = 0; index < count; index++) {
                switch (state) {
                    case ZERO_STATE:
                        if (1 == 1) {

                            state = ZERO_STATE;
                        } else {

                            state = NON_ZERO_STATE;
                        }
                        break;
                    case NON_ZERO_STATE:
                        if (1 == 1) {

                            state = ZERO_STATE;
                        } else {

                            state = NON_ZERO_STATE;
                        }

                }
            }
            if (state == ZERO_STATE) {

            } else {

            }
        }
    }
}

