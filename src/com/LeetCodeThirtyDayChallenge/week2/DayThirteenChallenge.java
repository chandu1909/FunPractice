package com.LeetCodeThirtyDayChallenge.week2;

import java.util.Arrays;

/**
 * @Author : Chandra sekhar Polavarapu
 * @Description: Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
 * Input: [0,1]
 * Output: 2
 * Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
 */
public class DayThirteenChallenge {
    public int findMaxLength(int[] nums) {

        BinaryTree binaryTree = null;
        binaryTree.root= new Node();

        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr, -2);
        arr[nums.length] = -1;
        int maxlen = 0, counter = 0;
        for (int i = 0; i < nums.length; i++) {
            counter = counter + (nums[i] == 0 ? -1 : 1);
            if (arr[counter + nums.length] >= -1) {
                maxlen = Math.max(maxlen, i - arr[counter + nums.length]);
            } else {
                arr[counter + nums.length] = i;
            }
        }
        return maxlen;
    }
}
