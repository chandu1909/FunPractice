package com.LeetCodeThirtyDayChallenge.week2;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.Tree;

import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        DayEightChallenge dayEightChallenge = new DayEightChallenge();

        //@Todo I need to figure out a way to pass a complete linkedlist the method.
        // dayEightChallenge.middleNode(new ListNode(2));

        DayNineChallenge dayNineChallenge = new DayNineChallenge();
        dayNineChallenge.backspaceCompare("ab#c", "ad#c");

        DayTenChallenge dayTenChallenge = new DayTenChallenge();
        dayTenChallenge.getMin();
        dayTenChallenge.push(2);
        dayTenChallenge.push(0);
        dayTenChallenge.getMin();
        dayTenChallenge.pop();

        DayElevenChallenge dayElevenChallenge = new DayElevenChallenge();

        //dayElevenChallenge.diameterOfBinaryTree()*/
        DayTwelveChallnge dayTwelveChallnge = new DayTwelveChallnge();
        int []a = {9,10,1,7,3};
        dayTwelveChallnge.lastStoneWeight(a);

    }
}
