package ru.Busygin.Mikhail;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private ByteArrayOutputStream testOut;

    @Before
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @Test
    public void shouldAnswerWithTrue() {
        App.main(new String[]{});
        assertEquals( "Hello World Hello World Hello World\r\n", testOut.toString());
    }

    @After
    public void restoreSystemInputOutput() {
        System.setOut(System.out);
    }
}
