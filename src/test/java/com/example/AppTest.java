package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testGreet() {
        String result = App.greet("World");
        assertEquals("Hello, World! Build successful 🚀", result);
    }
}
