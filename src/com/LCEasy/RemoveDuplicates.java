package com.LCEasy;

import java.util.Arrays;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear
 * only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the
 * input array in-place with O(1) extra memory.
 *
 * Clarification:
 *
 * Confused why the returned value is an integer but your answer is an array?
 *
 * Note that the input array is passed in by reference, which means modification to the input array will be known to the caller as well.
 *
 * Internally you can think of this:
 *
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeDuplicates(nums);
 *
 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        /** This method will not work because below line creates a new array internally.
        nums = Arrays.stream(nums).distinct().toArray();
        return nums.length;*/

        //alternative approach
        int j=0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]!=nums[j])
            {
                j++;
                nums[j] = nums[i];
            }
        }

        return j+1;

    }

}
