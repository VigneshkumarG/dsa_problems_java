package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void push() {
        MyStack s = new MyStack(1);
        assertEquals(s.size(),0);
        s.push(10);
        assertEquals(s.top(), 10);
        assertEquals(s.size(),1);
    }

    @Test
    void pop() {
        MyStack s = new MyStack(2);
        s.push(10);
        s.push(20);
        assertEquals(s.size(),2);
        assertEquals(s.pop(), 20);
        assertEquals(s.size(),1);
        assertEquals(s.pop(), 10);
        assertEquals(s.size(), 0);
        assertEquals(s.pop(), -1);
        assertEquals(s.pop(), -1);
    }

    @Test
    void size() {
        MyStack s = new MyStack(2);
        assertEquals(s.size(), 0);
        s.push(10);
        assertEquals(s.size(),1);
        s.push(20);
        assertEquals(s.size(),2);
        s.pop();
        assertEquals(s.size(),1);
        s.pop();
        assertEquals(s.size(),0);
    }

    @Test
    void isEmpty() {
        MyStack s = new MyStack(2);
        assertEquals(s.isEmpty(), true);
        s.push(10);
        assertEquals(s.isEmpty(), false);
        s.pop();
        assertEquals(s.isEmpty(), true);
    }
}