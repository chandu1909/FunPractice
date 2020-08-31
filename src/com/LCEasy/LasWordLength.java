package com.LCEasy;

import java.util.Objects;
import java.util.Stack;
import java.util.function.Predicate;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a maximal substring consisting of non-space characters only.
 * <p>
 * Example:
 * <p>
 * Input: "Hello World"
 * Output: 5
 */
public class LasWordLength {
    public int lengthOfLastWord(String s) {

        //Going to add words in a stack so that I can print the count of last
        Stack<String> wordStack = new Stack();
        if (Objects.nonNull(s)) {

            for (String word : s.split(" ")) {
                wordStack.push(word);
            }
        }
        return wordStack.isEmpty() ? 0 : wordStack.peek().length();
    }

}
