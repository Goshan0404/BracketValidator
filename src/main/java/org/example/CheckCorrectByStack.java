package org.example;

import java.util.Stack;

public class CheckCorrectByStack implements CheckCorrect {
    String s = "";

    @Override
    public Boolean isCorrect() {
        return isValid();
    }

    private Boolean isValid() {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if (stack.isEmpty()) {
                return false;
            }
            else {
                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                        (ch == ']' && last != '[') ||
                        (ch == '}' && last != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
