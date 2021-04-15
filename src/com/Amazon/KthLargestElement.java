package com.Amazon;

import java.util.Arrays;

/**
 * @Author chandra sekhar Polavarapu Given an integer array nums and an integer k, return the kth
 * largest element in the array.
 *
 * <p>Note that it is the kth largest element in the sorted order, not the kth distinct element.
 */
public class KthLargestElement {

  public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    System.out.println("kth largest element: " + nums[nums.length - k]);
    return nums[nums.length - k];
  }
}
