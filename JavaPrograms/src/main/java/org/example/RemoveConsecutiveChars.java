package org.example;

import java.util.Stack;

public class RemoveConsecutiveChars {

    public static String removeConsecutiveDuplicates(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i <input.length() ; i++) {
            Character ch = input.charAt(i);
            if (stack.isEmpty()) {
                stack.push(ch);
            }else if (stack.peek() != ch) {
                stack.push(ch);
            }
        }
        Stack<Character> reverse = new Stack<>();
        while (stack.isEmpty() == false){
            reverse.push(stack.pop());
        }
        String output = "";
        while (reverse.isEmpty() == false){
            output += reverse.pop();
        }
        return output;
    }

    public static String removePairOfDuplicates(String str){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (stack.isEmpty()){
                stack.push(ch);
            }
            else if (stack.peek() == ch) {
                stack.pop();
            }else {
                stack.push(ch);
            }
        }
        Stack<Character> reverse = new Stack<>();
        while (stack.isEmpty() == false){
            reverse.push(stack.pop());
        }
        String output = "";
        while (reverse.isEmpty() == false){
            output += reverse.pop();
        }
        return output;
    }
}
