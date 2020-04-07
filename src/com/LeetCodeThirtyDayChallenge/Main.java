package com.LeetCodeThirtyDayChallenge;

import com.LeetCodeThirtyDayChallenge.DayOneChallenge;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DayOneChallenge dayOneChallenge = new DayOneChallenge();
        DayTwoChallenge dayTwoChallenge = new DayTwoChallenge();
        DayThreeChallenge dayThreeChallenge = new DayThreeChallenge();
        DayFourChallenge dayFourChallenge = new DayFourChallenge();
        DayFiveChallenge dayFiveChallenge = new DayFiveChallenge();
        DaySixChallenge daySixChallenge = new DaySixChallenge();

        String []strArray  = {"eat", "tea", "tan", "ate", "nat", "bat"};
        daySixChallenge.groupAnagrams(strArray);

        int stockPrice[] = {7, 1, 5, 3, 6, 4};
        dayFiveChallenge.maxProfit(stockPrice);
        int arrayWithZeros[] = {1, 2, 0, 3, 6};
        dayFourChallenge.moveZeroes(arrayWithZeros);

        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        dayThreeChallenge.maxSubArray(nums);

        boolean result1 = dayTwoChallenge.isHappy(35);

        System.out.println("result is: " + result1);
        int sampleArray[] = {4, 1, 2, 1, 2};
        int result = dayOneChallenge.singleNumber(sampleArray);
        System.out.println(result);
    }
}
