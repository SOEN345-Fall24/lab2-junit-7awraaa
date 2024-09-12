package org.example;

import org.example.Example;
import org.junit.Test;
import static org.junit.Assert.*;


public class ExampleTest {

    @Test
    public void testFuncA_pos() {
        Example example = new Example(5,3);
        int resultA = example.Function_A(10);
        assertEquals(15, resultA);
    }

    @Test
    public void testFuncB_more() {
        Example example = new Example(3,2);
        int resultB = example.Function_B(10);
        assertEquals(8, resultB);

    }

    @Test
    public void tesFuncA_neg() {
        Example example = new Example(5,3);
        int resultA = example.Function_A(-4);
        assertEquals(-9, resultA);
    }

    @Test
    public void testFuncB_less() {
        Example example = new Example(3,2);
        int resultB = example.Function_B(4);
        assertEquals(6, resultB);
    }




}