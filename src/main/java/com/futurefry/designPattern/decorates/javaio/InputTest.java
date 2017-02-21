package com.futurefry.designPattern.decorates.javaio;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author ranjeet
 */
public class InputTest {

    public static void main(String[] args) throws IOException {

        int c;
        InputStream fileNameInputStream = InputTest.class.getClassLoader().getResourceAsStream("test_lowercase_stream");
        try (InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(fileNameInputStream))) {
            while((c = inputStream.read()) >= 0 ){
                System.out.print((char)c);
            }
        }

    }

}
