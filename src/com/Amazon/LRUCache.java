package com.Amazon;

import java.util.LinkedHashMap;

/**
 * @Author chandra sekhar Polavarapu
 */
public class LRUCache extends LinkedHashMap<Integer, Integer> {
    private int capacity;

    public LRUCache(int  capacity){
        super(capacity,0.75F, true);

    }
}
