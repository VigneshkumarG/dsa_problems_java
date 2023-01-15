package org.example;

import java.util.Stack;

public class NextGreaterElement {

    public static long[] nextLargerElement(long[] arr, int n)
    {
        Stack<Long> stack = new Stack<>();
        long[] results = new long[n];
        for (int i = n-1; i > -1; i--) {
            while (stack.isEmpty() == false && stack.peek() <= arr[i]) {
                stack.pop();
            }
            long result = stack.isEmpty() ? -1 : stack.peek();
            results[i] = result;
            stack.push(arr[i]);
        }
        return  results;
    }
}
