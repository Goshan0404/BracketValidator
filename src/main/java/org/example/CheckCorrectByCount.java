package org.example;

import java.util.Stack;

public class CheckCorrectByCount implements CheckCorrect {
    String s = "";

    @Override
    public Boolean isCorrect() {
        return isValid();
    }

    private Boolean isValid() {
        int resultCount = 0;
        for (char ch: s.toCharArray()) {
            if ((ch == '(' || ch == '[' || ch == '{')) {
                resultCount++;
            }
        }
        return true;
    }
}
