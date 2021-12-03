package com.EPAMPractice;

/**
 * @Author chandra sekhar Polavarapu
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());

            String out_ = Solve(N);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static String Solve(int N) {
        // your code goes here

        String[] nums = new String[N + 1];

        nums[0] = "";

        int blocks = 0;
        int movement = 0;

        // loop from 1 to N
        for (int i = 1; i < N + 1; i++) {

            // Checking if the number is power of two
            if (isPowerOfTwo(i + 1)) {
                blocks = blocks + 1;
            }

            if (isSeriesFour(i, blocks)) {
                movement
                        = (int) Math.pow(
                        2, blocks - 1);

                // Distance to previous
                // block nums
                nums[i] = "4" + nums[i - movement] + "4";
            } else {

                movement
                        = (int) Math.pow(
                        2, blocks);

                // Distance to previous
                // block nums
                nums[i] = "5" + nums[i - movement] + "5";
            }
        }

        return nums[N];


    }

    public static boolean isPowerOfTwo(int N) {
        double number
                = Math.log(N) / Math.log(2);
        int checker = (int) number;
        return number - checker == 0;
    }

    // if a number belongs to 4 series
    // it should lie between 2^blocks -1 to
    // 2^blocks + 2^(blocks-1) -1
    public static boolean isSeriesFour(
            int N, int digits) {
        int upperBound
                = (int) (Math.pow(2, digits)
                + Math.pow(2, digits - 1)
                - 1);
        int lowerBound
                = (int) (Math.pow(2, digits)
                - 1);
        return (N >= lowerBound)
                && (N < upperBound);
    }
}
