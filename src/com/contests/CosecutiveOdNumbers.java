package com.contests;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

/**
 * Given an integer array arr,
 * return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 */
public class CosecutiveOdNumbers {
    public boolean threeConsecutiveOdds(int[] arr) {

        if (Objects.nonNull(arr)) {
            ArrayList oddNumbers = new ArrayList();

            for (int i : arr) {
                if (i % 2 != 0 && oddNumbers.size() != 3) {
                    oddNumbers.add(i);
                } else {
                    if (oddNumbers.size() == 3)
                        return true;
                    else oddNumbers.clear();
                }
            }
            if (oddNumbers.size()==3) return true;

        }
        return false;
    }

}
