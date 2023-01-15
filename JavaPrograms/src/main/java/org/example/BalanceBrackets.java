package org.example;

import java.util.EmptyStackException;
import java.util.Stack;

public class BalanceBrackets {

    private  static boolean matchingBrackets(char a, char b) {
        if (a == '(' && b == ')') {
            return true;
        }
        if (a == '[' && b == ']'){
            return true;
        }
        return a == '{' && b == '}';
    }
    static boolean isBalanced(String x)  {
        System.out.println(x);

        Stack<Character> stack = new Stack();
        for(int i = 0 ; i < x.length(); i++) {
            char ch = x.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                if(matchBrackets(stack.peek(), ch) == false){
                    return false;
                }
                stack.pop();
            }
        }
//        while (stack.isEmpty() == false) {
//            System.out.println(stack.pop());
//        }
        return stack.isEmpty();
    }

    private static boolean matchBrackets(char open, char close) {
        if(open == '(' && close == ')'){
            return true;
        }
        if(open == '[' && close == ']'){
            return true;
        }
        return open == '{' && close == '}';
    }
}
