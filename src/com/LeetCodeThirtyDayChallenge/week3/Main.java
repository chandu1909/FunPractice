package com.LeetCodeThirtyDayChallenge.week3;

public class Main {
    public static void main(String args[]){
        DayFifteen dayFifteen = new DayFifteen();
        int inputAray[] = {1,2,3,4};

        dayFifteen.productExceptSelf(inputAray);

        DaySixteenChallenge daySixteenChallenge = new DaySixteenChallenge();
        boolean result = daySixteenChallenge.checkValidString("*)(");
        System.out.println(result);

    }
}
