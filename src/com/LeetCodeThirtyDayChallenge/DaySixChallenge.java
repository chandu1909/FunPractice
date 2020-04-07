package com.LeetCodeThirtyDayChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description: Returns a list of lists
 */

public class DaySixChallenge {
    public List<List<String>> groupAnagrams(String[] strs) {
        List <List <String>> resultList = new ArrayList<>();

        //making sure the number of elements are at least 2
        if (strs.length==0){
            return new ArrayList<>();
        }

        List<String> avoidList = new ArrayList<>();

        for (int i = 0; i< strs.length;i++){

            if (avoidList.contains(strs[i])==false){
                List<String> newList = new ArrayList<String>();
                newList.add(strs[i]);
                for (int j =i+1; j< strs.length;j++){
                    if (strs[i].length() == strs[j].length()){
                        boolean result = processWords(strs[i],strs[j]);
                        if (result && avoidList.contains(strs[j])==false && i!=j){
                            newList.add(strs[j]);
                        }
                    }
                }
                resultList.add(newList);
                avoidList.addAll(newList);
            }
        }
        System.out.println(resultList);
        return resultList;
    }

    private boolean processWords(String str1, String str2) {
        char[] ca = str1.toCharArray();
        Arrays.sort(ca);
        char[] ca2 = str2.toCharArray();
        Arrays.sort(ca2);

        if (Arrays.equals(ca,ca2)){
            return true;
        }
        return false;
    }
}
