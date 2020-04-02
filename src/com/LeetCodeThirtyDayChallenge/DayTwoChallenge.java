package com.LeetCodeThirtyDayChallenge;

/**
 * @Author: Chandra sekhar Polavarapu
 * Description: Below pogram returns true if a number is happy and false if the number is not happy.
 * Happy: sum of it squares of the digits in the number should be 1 if not repeat the process until you figure out
 * its never gonna be 1
 */
public class DayTwoChallenge {
    public boolean isHappy(int n) {
        int sum = 0;
        boolean flag = false;
        try {
            while (n > 0) {
                sum = sum + (n % 10) * (n % 10); //Storing the sum
                n = n / 10; //replacing next value
            }
            if (sum > 9 || sum == 7) { //sum==7 is not needed. but Leetcode doesnt wait until exception happens. It says timedout
                return isHappy(sum); //recursion
            } else if (sum == 1) flag = true;
            return flag;
        } catch (StackOverflowError e) {
            return flag;
        }

    }
}
