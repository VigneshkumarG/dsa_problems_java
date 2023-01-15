package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BalanceBracketsTest {


    @Test
    void testInputs(){
        ArrayList<String> inputs = new ArrayList<>();
        ArrayList<Boolean> outputs = new ArrayList<>();
        // Case 1
        inputs.add("()");
        outputs.add(true);
        // Case 2
        inputs.add("((())");
        outputs.add(false);
//        // Case 3
        inputs.add("([)]");
        outputs.add(false);
        // Case 4
        inputs.add("{}([()])");
        outputs.add(true);
//        // Case 5
        inputs.add("(()))");
        outputs.add(false);
        //
        for (int i = 0; i < inputs.size(); i++) {
            String input = inputs.get(i);
            Boolean output = outputs.get(i);
            assertEquals(BalanceBrackets.isBalanced(input), output);
        }
    }

}