package com.LCEasy;

/**
 * @Author: chandra sekhar Poalvarapu
 * Main class for all Leet code easy questions
 */
public class Main {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int nums[] = {1,1,2};
        int len = removeDuplicates.removeDuplicates(nums);

        for (int i=0; i<len; i++){
            System.out.println(nums[i]);
        }

    }
}
