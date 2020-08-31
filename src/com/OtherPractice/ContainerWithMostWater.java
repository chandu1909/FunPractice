package com.OtherPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class ContainerWithMostWater {

    public int process(int height[]) {

        if (height.length == 0 || height.length < 2) {
            return 0; //cz we cannot store water if there is no bowl
        }

        int max = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        while (leftPointer < rightPointer) {
            max = Math.max(max, (rightPointer - leftPointer) * Math.min(height[leftPointer], height[rightPointer]));
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++; //moving to the right
            } else {
                rightPointer--; //moving to the left
            }
        }
        System.out.print(max);



        return max;
    }
}
