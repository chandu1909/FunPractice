package com.LeetCodeThirtyDayChallenge;

import java.util.Arrays;

/**
 * @Author: Chandra sekhar Polavarapu
 * @Description: This program find the largest contiguous sum of the sub array ina given integer array.
 * The below solution gives the result in O(n) time. But if you follow the Divid and Conquer algorithm instad of this you will
 * get better result in execution time.
 */
public class DayThreeChallenge {
    public int maxSubArray(int[] nums) {
        int maxValueFollows = 0;
        int maxValue = 0;
        //The next two lines to cover the edge case when the array is completely negative values
        int negativeMax = Arrays.stream(nums).max().getAsInt();
        if (negativeMax < 0) return negativeMax;
        //traverse through the array and kep the maximum value in always max value until you fina a greater number
        for (int i : nums) {
            maxValueFollows = maxValueFollows + i;
            if (maxValue < maxValueFollows) {
                maxValue = maxValueFollows;
            }
            if (maxValueFollows < 0) {
                maxValueFollows = 0;
            }
        }
        System.out.println(maxValue);
        return maxValue;
    }
}
