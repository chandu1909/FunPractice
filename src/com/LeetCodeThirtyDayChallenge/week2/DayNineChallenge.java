package com.LeetCodeThirtyDayChallenge.week2;

/**
 * @Author: Chandra sekhar Poalvarapu
 * Description: Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 */
public class DayNineChallenge {
    public boolean backspaceCompare(String S, String T) {

        String resultS = process(S);
        String resultT = process(T);

        if (resultS.equals(resultT)) return true;

        return false;
    }

    /**
     * @param S holds a string
     * @return a processed string after removing the characters and backspaces
     */
    public String process(String S) {
        StringBuilder resultS = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char character = S.charAt(i);
            if (Character.isAlphabetic(character)) { //checking if the character is alphabet
                resultS.append(S.charAt(i));
            } else if (character == '#' && resultS.length() != 0) {
                resultS.deleteCharAt(resultS.length() - 1); //if the current character is # we need to backspace the previous character
            }
        }

        return resultS.toString();
    }
}
