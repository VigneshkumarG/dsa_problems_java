package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementTest {

    @Test
    void testInput1(){
        long[] input = new long[]{1,3,2,4};
        long[] output = new long[]{3,4,4,-1};
        long[] result = NextGreaterElement.nextLargerElement(input, input.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], output[i]);
        }
    }

    @Test
    void testInput2(){
        long[] input = new long[]{6,8,0,1,3};
        long[] output = new long[]{8,-1,1,3,-1};
        long[] result = NextGreaterElement.nextLargerElement(input, input.length);
        for (int i = 0; i < result.length; i++) {
            assertEquals(result[i], output[i]);
        }
    }
}