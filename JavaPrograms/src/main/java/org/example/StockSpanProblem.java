package org.example;

import java.util.Stack;

public class StockSpanProblem {

    public static int[] calculateSpan(int price[], int n)
    {
        Stack<Integer> stack = new Stack<>();
        //
        int[] results = new int[n];
        //
        for (int i = 0; i < n; i++) {
            while (stack.isEmpty() == false && price[ stack.peek()] <= price[i]){
                stack.pop();
            }
            int span;
            if(stack.isEmpty()) {
                span = i + 1;
            }else {
                span = i - stack.peek();
            }
            results[i] = span;
            stack.push(i);
        }
        return results;
    }


}
