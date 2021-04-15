package com.Amazon;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Author chandra sekhar Polavarapu You are given an array prices where prices[i] is the price of a
 * given stock on the ith day.
 *
 * <p>You want to maximize your profit by choosing a single day to buy one stock and choosing a
 * different day in the future to sell that stock.
 *
 * <p>Return the maximum profit you can achieve from this transaction. If you cannot achieve any
 * profit, return 0.
 */
public class Stocks {
  public int maxProfit(int[] prices) {
     int maxProfit =0;
     int minPrice = Integer.MAX_VALUE;
     for (int i=0;i<prices.length;i++){
        if (prices[i]<minPrice){
            minPrice=prices[i];
        }
        else if(prices[i]-minPrice >maxProfit){
            maxProfit = prices[i]-minPrice;
        }
     }
     return maxProfit;
  }
}
