package com.Amazon;

/** @Author chandra sekhar Polavarapu */
public class MainClass {
  public static void main(String[] args) {
    /*
    int[] elements = {12, 67, 40, 23, 120, 9, 5};
    int k = 3;
    LargestKElements largestKElements = new LargestKElements(elements, k);*/

    // findingMissingIntegersInput
    /*int[] numbers = {1, 1};
    MissingNumbersArray missingNumbersArray = new MissingNumbersArray();
    System.out.println("*****************Disappiered Numbers output *******************");
    System.out.println(missingNumbersArray.findDisappearedNumbers(numbers));*/

    /* /// top K friequent words
    String[] words = {"i", "love", "leetcode", "i", "love", "coding"};
    TopKFrequentWords topKFrequentWords = new TopKFrequentWords();
    System.out.println(
    topKFrequentWords.topKFrequent(words, 2));*/

    /* ///Kth largest Element
    KthLargestElement kthLargestElement = new KthLargestElement();
    int[] elements2 = {3,2,3,1,2,4,5,5,6};
    kthLargestElement.findKthLargest(elements2,4);*/

  /*  // Buy stock and sell for profit
    Stocks stocks = new Stocks();
    int[] stockPrices = {7, 1, 5, 3, 6, 4};
    System.out.println(stocks.maxProfit(stockPrices));*/

  //FindMedian of two sorted arrays
    MedianOfTheTwoSortedArrays medianOfTheTwoSortedArrays = new MedianOfTheTwoSortedArrays();
    int[] arr1 = {1,3};
    int[] arr2 = {2,4};
    medianOfTheTwoSortedArrays.findMedianSortedArrays(arr1,arr2);
  }
}
