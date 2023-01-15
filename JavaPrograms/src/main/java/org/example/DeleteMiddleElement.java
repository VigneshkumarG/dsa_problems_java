package org.example;

import java.util.Stack;

public class DeleteMiddleElement {
    public static void  deleteMiddleElement(Stack<Integer> s, int sizeOfStack) {
        Stack<Integer> firstHalf = new Stack<>();
        int middleIndex = (int)  Math.ceil((sizeOfStack + 1) / 2);
        if (sizeOfStack % 2 == 0) {
            middleIndex = middleIndex + 1;
        }
        for (int i = 1; i < middleIndex; i++) {
            firstHalf.push(s.pop());
        }
        s.pop();
        while (firstHalf.isEmpty() == false){
            s.push(firstHalf.pop());
        }
    }
}
