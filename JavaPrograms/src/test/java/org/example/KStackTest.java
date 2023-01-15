package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KStackTest {


    @Test
    void testPushFunction(){
        KStack stack = new KStack(5,2);
        assertEquals(stack.isEmpty(0), true);
        assertEquals(stack.isEmpty(1), true);
        assertEquals(stack.size(0),0);
        assertEquals(stack.size(1),0);
        stack.printStack();
        stack.push(100, 0);
        assertEquals(stack.isEmpty(0), false);
        assertEquals(stack.size(0),1);
        assertEquals(stack.peek(0),100);
        stack.push(200,0);
        assertEquals(stack.peek(0),200);
        stack.push(300,0);
        assertEquals(stack.peek(0),300);
        stack.push(400,0);
        assertEquals(stack.peek(0),400);
        stack.printStack();
        assertEquals(stack.pop(0), 400);
        stack.printStack();
        assertEquals(stack.size(0),3);
    }

}