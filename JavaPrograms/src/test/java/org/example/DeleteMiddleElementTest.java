package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class DeleteMiddleElementTest {

    @Test
    void testEvenSizeOfStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        DeleteMiddleElement.deleteMiddleElement(stack, stack.size());
        System.out.println(stack.toString());
        assertEquals("[1, 3, 4]", stack.toString());
    }

    @Test
    void testOddSizeOfStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        DeleteMiddleElement.deleteMiddleElement(stack, stack.size());
        System.out.println(stack.toString());
        assertEquals("[1, 2, 4, 5]", stack.toString());
    }

}