package com.OtherPractice;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateStrings {
    public void findDuplicates(String strList[]){

        int counter =1;
        HashMap<String,Integer> hashMap = new HashMap<>();

        for (String i:strList){
            if (hashMap.containsKey(i)){
                hashMap.put(i,hashMap.get(i)+1);
            }else {
                hashMap.put(i,1);
            }
        }

        System.out.println(hashMap);

    }
}
