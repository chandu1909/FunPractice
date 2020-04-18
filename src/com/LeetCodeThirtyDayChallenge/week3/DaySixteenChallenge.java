package com.LeetCodeThirtyDayChallenge.week3;

/**
 * @Author : Chandra sekhar Poalvarapu
 * @Description: iven a string containing only three types of characters: '(', ')' and '*', write a function to check whether this string is valid. We define the validity of a string by these rules:
 * <p>
 * Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 * Any right parenthesis ')' must have a corresponding left parenthesis '('.
 * Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 * '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string.
 * An empty string is also valid.
 */
public class DaySixteenChallenge {
    public boolean checkValidString(String s) {
        int minOpen = 0, maxOpen = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    minOpen++;
                    maxOpen++;
                    break;
                case ')':
                    minOpen--;
                    maxOpen--;
                    break;
                default:
                    minOpen--;
                    maxOpen++;
            }
            if (maxOpen < 0) {
                return false;
            }
            minOpen = Math.max(minOpen, 0);
        }
        return minOpen == 0;
    }
}
