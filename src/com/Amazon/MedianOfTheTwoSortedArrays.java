package com.Amazon;

import java.util.Arrays;

/** @Author chandra sekhar Polavarapu */
public class MedianOfTheTwoSortedArrays {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int size = nums1.length + nums2.length;
    int resultArray[] = new int[size];
    int k=0;

    for (int i=0;i<nums1.length;i++){
        resultArray[k] = nums1[i];
        k++;
    }
    for (int j=0;j< nums2.length;j++){
        resultArray[k] = nums2[j];
        k++;
    }

    Arrays.sort(resultArray);

  /*  int i = 0, j = 0, k = 0;

    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        resultArray[k] = nums1[i];
        k++;
        i++;
      } else {
        resultArray[k] = nums2[j];
        j++;
        k++;
      }
    }

    while (i < nums1.length) {
      resultArray[k] = nums1[i];
      k++;
      i++;
    }
    while (j < nums2.length) {
      resultArray[k] = nums2[j];
      j++;
      k++;
    }*/

    // finding the median on newly created array
    double median = 0;
    median =
        resultArray.length % 2 != 0
            ? resultArray[resultArray.length / 2]
            : Double.valueOf(
                    resultArray[resultArray.length / 2]
                        + resultArray[((resultArray.length / 2) - 1)])
                / 2;
    System.out.println(median);
    return median;
  }
}
