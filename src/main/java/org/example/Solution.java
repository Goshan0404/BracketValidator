package org.example;

public class Solution {
    private final CheckCorrect checkCorrect;
    public Solution(CheckCorrect checkCorrect) {
        this.checkCorrect = checkCorrect;
    }

    Boolean isCorrect() {
        return checkCorrect.isCorrect();
    }
}
