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
        System.out.print(priorityQueue);
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

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // Sort by start

        // Record meeting that takes 1 room, sorted by earliest ending time
        PriorityQueue<int[]> currMeetings = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        int maxRooms = 0;
        for (int[] interval: intervals) {

            // if earilest end meeting ends before next, we let next meeting use the room
            if (!currMeetings.isEmpty() && currMeetings.peek()[1] <= interval[0]) {
                currMeetings.poll();
            }
            // Whether we have room or not, we must proceed next meeting
            currMeetings.add(interval);

            // Max meeting proceeding simuly
            maxRooms = Math.max(maxRooms, currMeetings.size());
        }
        return maxRooms;
    }
}

