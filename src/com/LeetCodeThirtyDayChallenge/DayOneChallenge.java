package com.LeetCodeThirtyDayChallenge;

import java.util.HashMap;
import java.util.Map;

public class DayOneChallenge {


    public int singleNumber(int nums[]) {

        HashMap<Integer, Integer> numberMap = new HashMap();
        int counter = 0;
        try {
            for (int i = 0; i < nums.length; i++) {
                //we will store element and the counter in a hashmap
                if (!numberMap.containsKey(nums[i])) {
                    numberMap.put(nums[i], 1);
                } else {
                    counter = numberMap.get(nums[i]);
                    counter++;
                    numberMap.put(nums[i], counter);
                }
            }
            for (Map.Entry<Integer, Integer> entry : numberMap.entrySet()) {
                if (entry.getValue().equals(1)) {
                    return entry.getKey();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }


        return 0;
    }
}


