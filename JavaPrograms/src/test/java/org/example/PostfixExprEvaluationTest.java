package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostfixExprEvaluationTest {

    @Test
    void testInput1(){
        String input = "231*+9-";
        int output = -4;
        assertEquals(output, PostfixExprEvaluation.evaluatePostFix(input));
    }

    @Test
    void testInput2(){
        String input = "123+*8-";
        int output = -3;
        assertEquals(output, PostfixExprEvaluation.evaluatePostFix(input));
    }

}