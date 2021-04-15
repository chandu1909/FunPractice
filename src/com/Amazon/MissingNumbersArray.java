package com.Amazon;

import java.util.*;

/**
 * @Author chandra sekhar Polavarapu
 *
 * <p>Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all
 * the integers in the range [1, n] that do not appear in nums. Solution: Sort them and
 */
public class MissingNumbersArray {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    if (nums.length < 1) {
      return new ArrayList<>();
    }
    Arrays.sort(nums);
    List<Integer> missingNumbersList = new ArrayList<>();
    Set<Integer> distinctElements = new HashSet<>();
    Arrays.stream(nums).forEach(i -> distinctElements.add(i));
    for (int i = 1; i <= nums.length; i++) {
      if (!distinctElements.contains(i)) {
        missingNumbersList.add(i);
      }
    }

    return missingNumbersList;
  }
}
