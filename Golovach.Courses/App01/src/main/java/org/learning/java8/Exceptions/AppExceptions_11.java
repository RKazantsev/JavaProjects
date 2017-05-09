package org.learning.java8.Exceptions;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.RtMethodGenerator;

public class AppExceptions_11 {
    public static void main(String[] args) throws Exception {
        try {
            try {
                throw new Error();
            } catch (Error e) {
                throw new RuntimeException(e);
            }
        } catch (RuntimeException e) {
            throw new Exception(e);
//            System.out.println(e);
//            System.out.println(e.getCause());
//            System.out.println(e.getCause().getCause());
        }
    }
}
