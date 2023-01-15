package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfixToPostfixProblemTest {

    @Test
    void testInput1(){
        String input = "a+b*(c^d-e)^(f+g*h)-i";
        String output = "abcd^e-fgh*+^*+i-";
        assertEquals(output, InfixToPostfixProblem.infixToPostfix(input));
    }

    @Test
    void testInput2(){
        String input = "A*(B+C)/D";
        String output = "ABC+*D/";
        assertEquals(output, InfixToPostfixProblem.infixToPostfix(input));
    }

}