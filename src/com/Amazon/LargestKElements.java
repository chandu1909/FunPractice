package com.Amazon;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/** @Author chandra sekhar Polavarapu prints the largest K elements */
public class LargestKElements {
  public LargestKElements(int[] elments, int k) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
    Arrays.stream(elments).forEach(element -> priorityQueue.add(element));
    System.out.println("***************Result of Largest K elements in array ******************");
    for (int i = 0; i < k; i++) {
      System.out.println(priorityQueue.poll());
    }
  }
}
