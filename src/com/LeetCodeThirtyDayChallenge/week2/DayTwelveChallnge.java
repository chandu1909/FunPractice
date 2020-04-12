package com.LeetCodeThirtyDayChallenge.week2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DayTwelveChallnge {
    public int lastStoneWeight(int[] stones) {
        if (stones.length==0){
            return 0;
        }
        List<Integer> stonesList = Arrays.stream(stones).boxed().collect(Collectors.toList());
        while (stonesList.size()!=1){
            int stone1 = Collections.max(stonesList);
            int locationOfStone1 = stonesList.indexOf(stone1);
            stonesList.remove(locationOfStone1);
            int stone2 = Collections.max(stonesList);
            int locationOfStone2 = stonesList.indexOf(stone2);
            stonesList.remove(locationOfStone2);
            int remWeight = Math.max(stone1,stone2)-Math.min(stone1,stone2);
            stonesList.add(remWeight);
        }
        System.out.print(stonesList);

        return stonesList.get(0);

    }

}
