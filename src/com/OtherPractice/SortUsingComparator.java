package com.OtherPractice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author chandra sekhar Polavarapu
 */
public class SortUsingComparator {
    public List<String> sortElements(List<String> names){
        Collections.sort(names,(s1,s2)->{
            return s2.compareTo(s1);
        });

    System.out.println(names);
        return null;
    }
}
