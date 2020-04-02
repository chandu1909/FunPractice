package com.LeetCodeThirtyDayChallenge;

/**
 * @Author: Chandra sekhar Polavarapu
 * Description: Below pogram returns true if a number is happy and false if the number is not happy.
 * Happy: sum of it squares of the digits in the number should be 1 if not repeat the process until you figure out
 * its never gonna be 1
 *
 * developed based on Floyd's cycle finding algorithm
 */
public class DayTwoChallenge {
    public boolean isHappy(int n) {
        int slow = n,fast = n; // slow , fast
        do{
            slow = compute(slow); // slow computes only once
            fast = compute(compute(fast)); // fast computes 2 times
            if(slow == 1)return true; // if result is 1 its happy
        }while(slow != fast); // else at some point they will meet in the cycle as per the Floyd's cycle-finding algorithm

        return false; // result will be cycle

    }
    public int compute(int n){
        int s = 0;
        while(n != 0){
            s += (n%10)*(n%10); //Calculating sum of squares
            n = n/10; //going to the next digit
        }
        return s;
    }
}
