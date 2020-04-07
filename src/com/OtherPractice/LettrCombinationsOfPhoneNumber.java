package com.OtherPractice;

import java.util.*;

/**
 * @Author: Chandra sekhar Polavarapu
 * @Description: This program prints all combinations of letter pairs or triplets or more dependingon the input number
 */
public class LettrCombinationsOfPhoneNumber {

    public List letterCombinations(String digits) {
        List<String> finalList = new ArrayList<>();

        if (digits.equals("") || digits.length() < 1) {
            return finalList;
        }

        HashMap<Character, String> mapper = new HashMap<Character, String>();
        mapper.put('2', "abc");
        mapper.put('3', "def");
        mapper.put('4', "ghi");
        mapper.put('5', "jkl");
        mapper.put('6', "mno");
        mapper.put('7', "pqrs");
        mapper.put('8', "tuv");
        mapper.put('9', "wxyz");

        finalList.add("");

        for (int i = 0; i < digits.length(); i++) {
            ArrayList<String> temp = new ArrayList<>();
            String option = mapper.get(digits.charAt(i));
            for (int j = 0; j < finalList.size(); j++) {
                for (int p = 0; p < option.length(); p++) {
                    temp.add(new StringBuilder(finalList.get(j)).append(option.charAt(p)).toString());
                }
            }
            finalList.clear();
            finalList.addAll(temp);
        }
        System.out.print(finalList);
        return finalList;
    }
}
