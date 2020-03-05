package com.practice;

import java.util.Stack;

public class ParenthesisMatch {
    public static void main(String[] args) {
        ParenthesisMatch parenthesisMatch = new ParenthesisMatch();
        parenthesisMatch.isValid("()");
        parenthesisMatch.isValid("([)");
        parenthesisMatch.isValid("([)]");
        parenthesisMatch.isValid("({})");
        parenthesisMatch.isValid("({}{}{}){}");
        parenthesisMatch.isValid("");
        parenthesisMatch.isValid("[");
        parenthesisMatch.isValid("]");
        parenthesisMatch.isValid("((");
        parenthesisMatch.isValid("]]");

    }

    public boolean isValid(String s) {
        boolean valid = (s.length() % 2 == 0);
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length() && valid; i++) {
            if (s.charAt(i) == ')') valid = !stack.empty() && (stack.pop() == '(');
            else if (s.charAt(i) == ']') valid = !stack.empty() && (stack.pop() == '[');
            else if (s.charAt(i) == '}') valid = !stack.empty() && (stack.pop() == '{');
            else stack.push(s.charAt(i));
        }
        System.out.println(s + " " + (valid && stack.empty()));
        return valid && stack.empty();
    }
}
