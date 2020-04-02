package com.LeetCodeThirtyDayChallenge;

import com.LeetCodeThirtyDayChallenge.DayOneChallenge;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DayOneChallenge dayOneChallenge = new DayOneChallenge();
        DayTwoChallenge dayTwoChallenge = new DayTwoChallenge();

        boolean result1 = dayTwoChallenge.isHappy(7);

        System.out.println("result is: "+result1);
        int sampleArray[] = {4,1,2,1,2};
        int result = dayOneChallenge.singleNumber(sampleArray);
        System.out.println(result);
    }
}
