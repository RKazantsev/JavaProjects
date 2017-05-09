package org.learning.java8.Exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.NotSerializableException;
import java.io.UnsupportedEncodingException;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public class AppExceptions_6 {
    public static void main(String[] args) {
        try {
            try {
                throw new Error();
            } catch (RuntimeException e) {
            } catch (Exception e) {
            } catch (Error e) {
            } catch (Throwable e) {
            }
        } catch (Exception e) {
        } catch (Error e) {
        } catch (Throwable e) {
        }
    }
}
