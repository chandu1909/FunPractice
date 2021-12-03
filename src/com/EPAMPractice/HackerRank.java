package com.EPAMPractice;

/**
 * @Author chandra sekhar Polavarapu
 */
public class HackerRank {
    public static void main(String[] args) {
        int n = 649578;
        closedPaths(n);

    }


    public static void closedPaths(int n){
        int count =0;

        while(n!=0){
            int lastDigit = n%10; //taking the reminder for last digit

            if(lastDigit==0 || lastDigit ==4 || lastDigit == 6 || lastDigit ==9 ){
                count = count+1;
            }

            if(lastDigit ==8){
                count = count+2;
            }
            n=n/10; //taking the coefficient
        }
        System.out.println("sum of total closed path is: "+count);
    }


}
