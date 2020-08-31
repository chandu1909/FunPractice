package com.LeetCodeMayChallenge;

public class Main {
    public static void main(String args[]) {
        FindTheTownJudge findTheTownJudge = new FindTheTownJudge();
        int N = 3;
        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};

        findTheTownJudge.findJudge(N, trust);

        PerfectSquare perfectSquare = new PerfectSquare();
        perfectSquare.isPerfectSquare(1);
    }
}
