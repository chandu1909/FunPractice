package com.LeetCodeMayChallenge;

/**
 * @author : chandra
 * Description : return true if the given value is a perfect square. if not return false.
 */
public class PerfectSquare {
    public boolean isPerfectSquare(int num) {

        double result = Math.sqrt(num);
        if (result / (int) result == 1) {
            return true;
        }

        return false;

    }
}
