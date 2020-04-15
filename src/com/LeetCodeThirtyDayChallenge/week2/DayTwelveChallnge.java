package com.LeetCodeThirtyDayChallenge.week2;

import java.util.*;

/**
 * @Author: Chandra sekhar Polavarapu
 * @Description: We have a collection of stones, each stone has a positive integer weight.
 * <p>
 * Each turn, we choose the two heaviest stones and smash them together.  Suppose the stones have weights x and y with x <= y.  The result of this smash is:
 * <p>
 * If x == y, both stones are totally destroyed;
 * If x != y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
 * At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
 * <p>
 * Credits: Leetcode question
 */

public class DayTwelveChallnge {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) { //checking if input array is empty
            return 0;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); //priority queue stores every new element in order we ask for
        for (int i : stones) {
            priorityQueue.add(i);
        }
        while (priorityQueue.size() != 1) {
            int stone1 = priorityQueue.poll(); //poll method fetches the first element and deletes it which helps us not doing naother operation to delete
            int stone2 = priorityQueue.poll();
            int remWeight = Math.max(stone1, stone2) - Math.min(stone1, stone2);
            priorityQueue.add(remWeight);
        }
        System.out.println(priorityQueue);
        return priorityQueue.peek();

    }

}
