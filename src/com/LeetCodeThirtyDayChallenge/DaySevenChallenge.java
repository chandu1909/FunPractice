package com.LeetCodeThirtyDayChallenge;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author: Chandra sekhar polavarapu
 * @Description: Q: Given an integer array arr, count element x such that x + 1 is also in arr.
 * If there're duplicates in arr, count them seperately.
 */
public class DaySevenChallenge {
    public int countElements(int[] arr) {
        int count = 0;
        HashSet<Integer> hashSet = new HashSet<>(); //Hashset only stores distinct values so it wont have duplicates
        for (int i : arr) {
            hashSet.add(i);
        }
        for (int j : arr) {
            if (hashSet.contains(j + 1)) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
