package com.LeetCodeThirtyDayChallenge.week2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class DayTwelveChallnge {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i:stones){
            priorityQueue.add(i);
        }
        while (priorityQueue.size() != 1) {
            int stone1 = priorityQueue.poll();
            int stone2 = priorityQueue.poll();
            int remWeight = Math.max(stone1, stone2) - Math.min(stone1, stone2);
            priorityQueue.add(remWeight);
        }
        System.out.println(priorityQueue);
        return priorityQueue.peek();

    }

}
