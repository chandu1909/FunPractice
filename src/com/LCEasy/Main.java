package com.LCEasy;

/**
 * @Author: chandra sekhar Poalvarapu
 * Main class for all Leet code easy questions
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Remove Duplicates Problem
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int nums[] = {1,1,2};
        int len = removeDuplicates.removeDuplicates(nums);*/

        /** Length of last word problem
        LasWordLength lasWordLength = new LasWordLength();
        String sentence = "g";
        int size = lasWordLength.lengthOfLastWord(sentence);
        System.out.println("length of the word is : "+size);*/

       /* //FindPivot Problem
        int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        FindPivotElement findPivotElement = new FindPivotElement();
        findPivotElement.search(nums,target);*/
        CommonPreFix commonPreFix = new CommonPreFix();
        String []words = {"chandu","chandini","sanju"};
        commonPreFix.longestCommonPrefix(words);


    }
}
