package com.LeetCodeThirtyDayChallenge;

/**
 * @Author: Chandra sekhar Polavarapu
 * @Description: This program moves all the Zeros in the array to the end and still keeps the order
 * of the other elements
 */
public class DayFourChallenge {
    public void moveZeroes(int[] nums) {

        int zerosPointer = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[zerosPointer];
                nums[zerosPointer] = nums[i];
                nums[i] = temp;
                zerosPointer++;
            }
        }
    }
}
