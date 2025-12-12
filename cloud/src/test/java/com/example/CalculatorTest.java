package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(8, c.add(5, 3));
    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(15, c.multiply(5, 3));
    }
}
