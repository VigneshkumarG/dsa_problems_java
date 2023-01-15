package org.example;

import java.util.Stack;

public class PostfixExprEvaluation {
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < S.length() ; i++) {
            Character ch = S.charAt(i);
            if (isOperator(ch)) {
                Integer value2 = stack.pop();
                Integer value1 = stack.pop();
                if (ch == '+'){
                    stack.push(value1 + value2);
                } else if (ch == '-') {
                    stack.push(value1 - value2);
                } else if (ch == '*') {
                    stack.push(value1 * value2);
                } else if (ch == '/') {
                    stack.push(value1 / value2);
                }
            }else{
                Integer value = Integer.parseInt(ch + "");
                stack.push(value);
            }
        }
        return stack.pop();
    }

    private static boolean isOperator(Character ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}
