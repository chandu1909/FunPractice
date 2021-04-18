package com.Amazon;

import java.util.*;
import java.util.stream.Collectors;

/** @Author chandra sekhar Polavarapu */
public class SortArrayBasedonSecondArray {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
      int resultArray[] = new int[arr1.length];
      Set<Integer> arr2HashSet = new HashSet<>();
      Arrays.stream(arr2)
              .forEach(
                      i -> {
                          arr2HashSet.add(i);
                      });
      int k = 0;

      Map<Integer, Integer> arr1Map = new HashMap<>();
      for (int i : arr1) {
          if (arr1Map.get(i) == null) {
              arr1Map.put(i, 1);
          } else {
              arr1Map.put(i, arr1Map.get(i) + 1);
          }
      }

      for (int i: arr2){
          if (arr1Map.containsKey(i)){
              for (int j=0;j<arr1Map.get(i);j++){
                  resultArray[k] = i;
                  k++;
              }
              arr1Map.remove(i);
          }
      }

      List<Integer> keySetList = arr1Map.keySet().stream().sorted().collect(Collectors.toList());

      for (int i: keySetList){
          for (int j=0;j<arr1Map.get(i);j++){
              resultArray[k] = i;
              k++;
          }

      }
     /* for (int i: resultArray){
      System.out.print(i+",");
      }
*/
      return resultArray;
  }
}
