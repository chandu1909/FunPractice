package com.LeetCodeThirtyDayChallenge.week3;

import java.util.Arrays;

public class DayFifteen {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 0) return null;
        if (nums.length == 1) return nums;

        int[] product = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int prod = 0;
            int helper =1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    prod = helper * nums[j];
                    helper = prod;
                }
            }
            product[i] = prod;
        }
        System.out.println(Arrays.toString(product));
        return product;
    }
}
