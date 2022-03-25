package ru.Busygin.Mikhail;

import org.apache.commons.lang.WordUtils;

/**
 * Hello world!
 @author Mikhail Busygin
 @version 1.0
 */
public class App {
    /**
     *
     * @param args - arguments main method
     */
    public static void main( String[] args ) {
        String text = "hello world hello world hello world";
        System.out.println(WordUtils.capitalize(text));
    }
}
