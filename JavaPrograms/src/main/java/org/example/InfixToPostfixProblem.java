package org.example;

import java.util.Stack;

public class InfixToPostfixProblem {
    public static String infixToPostfix(String exp) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> opStack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            Character ch = exp.charAt(i);
            if (isOperator(ch)){
                while (opStack.isEmpty() == false && hasHighPrecedence(opStack.peek(), ch)){
                    stack.push(opStack.pop());
                }
                opStack.push(ch);
            }else if (ch == ')'){
              while (opStack.peek() != '('){
                  stack.push(opStack.peek());
                  opStack.pop();
              }
              opStack.pop();
            } else if (ch == '(') {
                opStack.push(ch);
            } else {
                stack.push(ch);
            }
        }
        while (opStack.isEmpty() == false){
            stack.push(opStack.pop());
        }
        String output = "";
        while (stack.isEmpty() == false){
            output += stack.pop();
        }
        String reverse = "";
        for (int i = output.length() - 1; i > -1 ; i--) {
            reverse += output.charAt(i) + "";
        }
        return  reverse;
    }

    private  static boolean isOperator(Character ch) {
        return ch == '^' || ch == '*' || ch == '/' || ch == '-' || ch == '+';
    }
    private static  boolean hasHighPrecedence(Character oper1, Character oper2) {
        int value1 = valueForOperator(oper1);
        int value2 = valueForOperator(oper2);
        return value1 >= value2;
    }

    private static  int valueForOperator(Character ch) {
        switch (ch){
            case '^': return  10;
            case '*': return 9;
            case '/': return 9;
            case '-': return 8;
            case '+': return 8;
        }
        return 0;
    }
}
