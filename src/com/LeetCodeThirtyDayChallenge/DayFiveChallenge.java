package com.LeetCodeThirtyDayChallenge;

/**
 * @Author Chandra sekhar Polavarapu
 * @Description: the below program is to find the best days to buy a stock and sell it for most profit. cannot to multiple
 * transactions at a time. ony one transaction either buy or sell.
 */
public class DayFiveChallenge {
    public int maxProfit(int[] prices) {
        int finalBalnce = 0;
        for (int i = 1; i < prices.length; i++) {
            int difference = prices[i] - prices[i - 1];
            if (difference > 0) {
                finalBalnce += difference;
            }
        }
        System.out.println(finalBalnce);
        return finalBalnce;
    }
}
