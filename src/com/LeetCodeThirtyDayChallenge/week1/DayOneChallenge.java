package com.LeetCodeThirtyDayChallenge.week1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Author: Chandra sekhar Polavarapu
 * Description: Find the one and only lonley number in the array. eg: [2,2,1] -> return 1.
 */
public class DayOneChallenge {
    public int singleNumber(int nums[]) {
        HashMap<Integer, Integer> numberMap = new HashMap();
        for (Integer i : nums) {
            numberMap.put(i, numberMap.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }

        }return 0;

        //we can alo write the entire 10 lines of code above in one line below.
        //return Arrays.stream(nums).reduce(0, (acc, x) -> acc ^ x);
    }
}


