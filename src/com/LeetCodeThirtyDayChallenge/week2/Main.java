package com.LeetCodeThirtyDayChallenge.week2;

import com.sun.source.tree.BinaryTree;
import com.sun.source.tree.Tree;

import java.util.LinkedList;

public class Main {
    public static void main(String args[]) {
        DayEightChallenge dayEightChallenge = new DayEightChallenge();

        //@Todo I need to figure out a way to pass a complete linkedlist the method.
        // dayEightChallenge.middleNode(new ListNode(2));
/*

        DayNineChallenge dayNineChallenge = new DayNineChallenge();
        dayNineChallenge.backspaceCompare("ab#c", "ad#c");

        DayTenChallenge dayTenChallenge = new DayTenChallenge();
        dayTenChallenge.getMin();
        dayTenChallenge.push(2);
        dayTenChallenge.push(0);
        dayTenChallenge.getMin();
        dayTenChallenge.pop();

        DayElevenChallenge dayElevenChallenge = new DayElevenChallenge();
*/

        //dayElevenChallenge.diameterOfBinaryTree()
        DayTwelveChallnge dayTwelveChallnge = new DayTwelveChallnge();
        int []a = {9,10,1,7,3};
        dayTwelveChallnge.lastStoneWeight(a);
/*
        DayThirteenChallenge dayThirteenChallenge = new DayThirteenChallenge();
        int binaryArray[] = {1,0,0,0,1};
        dayThirteenChallenge.findMaxLength(binaryArray);

        DayFourteenChallenge dayFourteenChallenge = new DayFourteenChallenge();
        int matrix[][] = {{1,1},{1,1},{0,2},{1,3}};
        dayFourteenChallenge.stringShift("abcdefg",matrix);*/

    }
}
