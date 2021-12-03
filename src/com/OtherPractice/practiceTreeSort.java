package com.OtherPractice;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author chandra sekhar Polavarapu
 */
public class practiceTreeSort {

    Map<Integer,String> treeMap = new TreeMap<>(Collections.reverseOrder());

    public void sortNumber(int[] nums){

        treeMap.put(25,"chandra");
        treeMap.put(12,"nancy");
        treeMap.put(32,"dolec");

        System.out.println(treeMap);

        //int list = (int) Arrays.stream(nums).filter(i -> i==5).collect(Collectors.counting());


    }

    public static void main(String[] args) {

        practiceTreeSort practiceTreeSort = new practiceTreeSort();

        int[] nums = {56,31,90,13,24,52,9};
        practiceTreeSort.sortNumber(nums);

    }
}


