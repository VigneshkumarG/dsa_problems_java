package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStackTest {

    @Test
    void testSizeFunction(){
        TwoStack twoStack = new TwoStack();
        assertEquals(twoStack.size1(), 0);
        assertEquals(twoStack.size2(), 0);
        //
        twoStack.push1(10);
        twoStack.push2(20);
        assertEquals(twoStack.size1(),1);
        assertEquals(twoStack.size2(),1);
        //
        twoStack.push1(100);
        twoStack.push2(200);
        assertEquals(twoStack.size1(),2);
        assertEquals(twoStack.size2(),2);
        //
        twoStack.pop1();
        twoStack.pop2();
        assertEquals(twoStack.size1(),1);
        assertEquals(twoStack.size2(),1);
        //
        twoStack.pop1();
        twoStack.pop2();
        assertEquals(twoStack.size1(), 0);
        assertEquals(twoStack.size2(),0);
    }


}