package com.contests;

public class MainClass {
    public static void main(String[] args) {
        CosecutiveOdNumbers cosecutiveOdNumbers = new CosecutiveOdNumbers();

        int arr[] = {1,1,1};
        boolean result =cosecutiveOdNumbers.threeConsecutiveOdds(arr);
        System.out.println(result);
    }
}
