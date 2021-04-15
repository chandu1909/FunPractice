package com.Amazon;

import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/** @Author chandra sekhar Polavarapu */
public class TopKFrequentWords {
  public List<String> topKFrequent(String[] words, int k) {
    Map<String, Long> collectMap =
        Arrays.stream(words).collect(groupingBy(Function.identity(), counting()));
    System.out.println(collectMap);
    List<String> candidates = new ArrayList(collectMap.keySet());

    Collections.sort(
        candidates,
        (w1, w2) ->
            (int)
                (collectMap.get(w1).equals(collectMap.get(w2))
                    ? w1.compareTo(w2)
                    : collectMap.get(w2) - collectMap.get(w1)));
    return candidates.subList(0,k);

  }
}

/**
 * for (int i = 0; i < k; i++) {
 *
 * <p>for (Map.Entry<String, Long> entry : collect.entrySet()) { if (entry.getValue() ==
 * maxValueInMap) { topKords.add(entry.getKey()); } }
 *
 * <p>System.out.println(topKords);
 */
