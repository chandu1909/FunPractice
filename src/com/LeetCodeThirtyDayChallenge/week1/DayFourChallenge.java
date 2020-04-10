package com.LeetCodeThirtyDayChallenge.week1;

/**
 * @Author: Chandra sekhar Polavarapu
 * @Description: This program moves all the Zeros in the array to the end and still keeps the order
 * of the other elements
 */
public class DayFourChallenge {
    public void moveZeroes(int[] nums) {

        int zerosPointer = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) { //Traverse through the array
            if (nums[i] != 0) { //Enters only if the number is non-zero
                temp = nums[zerosPointer];
                nums[zerosPointer] = nums[i]; //regular swapping
                nums[i] = temp;
                zerosPointer++; //this value doesn't get incrimented if the value is zero so it hols the location
            }
        }
    }
}
