package com.LeetCodeThirtyDayChallenge;

import com.LeetCodeThirtyDayChallenge.DayOneChallenge;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DayOneChallenge dayOneChallenge = new DayOneChallenge();
        int sampleArray[] = {4,1,2,1,2};
        int result = dayOneChallenge.singleNumber(sampleArray);
        System.out.println(result);
    }
}
