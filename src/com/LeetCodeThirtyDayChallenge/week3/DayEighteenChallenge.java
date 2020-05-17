package com.LeetCodeThirtyDayChallenge.week3;

public class DayEighteenChallenge {
    public int search(int[] nums, int target) {

        if (nums.length ==0) return -1;

        int left = 0;
        int right = nums.length-1;
        int mid = left+(right-left)/2;

        if (nums[mid] == target) return mid;
            if ( target < nums[mid]){
                for (int i = left; i<mid;i++){
                    if (nums[i] == target){
                        System.out.println("yey...Found the element on the left side :  " +i);
                        return i;
                    }
                }
            }else {
                for (int i=mid; i<right;i++){
                    if (nums[i] == target){
                        System.out.println("yey...Found the element on the right side. " +i);
                        return i;
                    }
                }
            }



        System.out.println("Couldn't find the element anywhere");
        return -1;
    }
}
