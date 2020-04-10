package com.LeetCodeThirtyDayChallenge.week1;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @Author: Chandra gsekhar Polavarapu
 * @Description: Returns a list of lists with all angrams in the given array
 */

public class DaySixChallenge {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        System.out.println(ans.values());
        return new ArrayList(ans.values());

    }
}
