package com.LeetCodeMayChallenge;

import java.util.HashMap;

import java.util.Map;

/**
 * In a town, there are N people labelled from 1 to N.  There is a rumor that one of these people is secretly the town judge.
 * <p>
 * If the town judge exists, then:
 * <p>
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given trust, an array of pairs trust[i] = [a, b] representing that the person labelled a trusts the person labelled b.
 * <p>
 * If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.
 */
public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {

        int[] trustArr = new int[N+1];
        for (int[] temp: trust) {
            trustArr[temp[0]]--;
            trustArr[temp[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (trustArr[i] == N - 1) return i;
        }
        return -1;
    }
}
