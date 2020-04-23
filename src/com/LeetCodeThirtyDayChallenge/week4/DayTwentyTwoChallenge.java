package com.LeetCodeThirtyDayChallenge.week4;

/**
 * @Author : Chandra sekhar Polavarapu
 * @Description: Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 * <p>
 * Example 1:
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 * Note:
 * The length of the array is in range [1, 20,000].
 * The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */
public class DayTwentyTwoChallenge {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) return 0; //checking if the array is empty

        int scoreCounter = 0;
        for (int i = 0; i < nums.length; ++i) {
            int scoreMatcher = 0;
            for (int j = i; j < nums.length; ++j) {
                scoreMatcher = scoreMatcher + nums[j];
                if (scoreMatcher == k) {
                    scoreCounter++;
                }
            }
        }
        return scoreCounter;
    }
}
