package com.LeetCodeThirtyDayChallenge.week2;

/**
 * @Author : Chandra Sekhar Polavarapu
 * @Description: you are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:
 * <p>
 * direction can be 0 (for left shift) or 1 (for right shift).
 * amount is the amount by which string s is to be shifted.
 * A left shift by 1 means remove the first character of s and append it to the end.
 * Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.
 * Return the final string after all operations.
 */
public class DayFourteenChallenge {
    public String stringShift(String s, int[][] shift) {
        if (s.length() == 0 || shift.length == 0) {
            return null;
        }
        for (int i = 0; i < shift.length; i++) {
            for (int j = 0; j < shift[i].length - 1; j++) {
                if (shift[i][j] == 0) {
                    s = leftShift(s, shift[i][j + 1]);
                } else {
                    s = rightShift(s, shift[i][j + 1]);
                }
            }
        }
        System.out.println(s);
        return s;
    }

    public String leftShift(String s, int shifts) {

        return s.substring(shifts) + s.substring(0, shifts);
    }

    public String rightShift(String s, int shifts) {
        return leftShift(s, s.length() - shifts);
    }
}
