package com.mobSquadPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author chandra sekhar Polavarapu
 */
public class Sample1 {
    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here
        boolean result = arr.stream().anyMatch(i->i.intValue() == k);
        if (result)return "YES";
    return "NO";
    }

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        if (l <1 || r > 100000 ){
            return new ArrayList<>();
        }
        return new ArrayList<>();
    }

    public static String featuredProduct(List<String> products) {
        // Write your code here
        for (String product : products) {
            int i =0;
            if(product.charAt(i) == '1'){

            }
        }

        return null;
    }
}
