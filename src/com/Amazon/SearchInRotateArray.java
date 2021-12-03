package com.Amazon;

import java.sql.SQLOutput;
import java.util.Arrays;

/** @Author chandra sekhar Polavarapu */
public class SearchInRotateArray {
  public int search(int[] nums, int target) {

    if(nums.length == 0){
      return -1;
    }


    int midPoint = nums[(nums.length/2)];

    //if the array is not rotated
    if(nums[0] < nums[nums.length -1]){
      return Arrays.binarySearch(nums,target);
    }

    if(target > midPoint){
      for(int i =0; i< nums.length/2;i++){
        if(target == nums[i]){
          return i;
        }
      }
    }
    else{
      for(int j= nums.length/2; j< nums.length; j++){

        if(target == nums[j]){
          return j;
        }
      }
    }

    return -1;
    }
}
