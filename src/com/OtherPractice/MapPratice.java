package com.OtherPractice;

import java.util.*;

/**
 * @Author chandra sekhar Polavarapu
 */
public class MapPratice {

  public static void main(String[] args) {

      Map<Integer, String> hashmap = new HashMap<Integer, String>();

      hashmap.put(2,"chandu");
      hashmap.put(3,"sanju");
      hashmap.put(1, "uma");



      Set<Map.Entry<Integer, String>> i=hashmap.entrySet();

    System.out.println(Collections.max(hashmap.values()));

      //treeMap();
/*
    for(Integer key : hashmap.keySet()){
      System.out.println(hashmap.get(key));
    }

    for(Map.Entry<Integer,String> map : hashmap.entrySet()){
      System.out.println(map.getKey()+ ": " +map.getValue());
    }*/
    //

      int[] arr = {1,2,3,4,5,6,7,8,9};
    System.out.print(Arrays.binarySearch(arr,5));

  }

  /*public static void treeMap(){
      TreeMap<Integer,Integer> tree = new TreeMap<>();
      tree.put(10,20);

      Map.Entry<Integer,Integer> beforeEnd = tree.lowerEntry(25);

      if(beforeEnd.getValue() > 15){
      System.out.println("entered");
      }

      if(beforeEnd.getValue() >25){
      System.out.println("true entered");
      }
      StringJoiner
    System.out.println(tree.lowerEntry(20));
  }
*/



}
