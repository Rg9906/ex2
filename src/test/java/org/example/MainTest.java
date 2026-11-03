package org.example;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testAddition() {

        String input = "1\n10\n20\n0\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{});

        String output = outContent.toString();

        assertTrue(output.contains("Addition: 30.0"));

        System.setIn(System.in);
        System.setOut(System.out);
    }
}