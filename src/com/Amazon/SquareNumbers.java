package com.Amazon;

public class SquareNumbers {

    public static void main(String[] args) {
        /*int []input = {-4,-1,0,3,10};
        squareNumbers(input);*/

        int[] rotation = {1, 2, 3, 0, 4, 0, 5, 6, 0, 7};
        //rotateNumber(rotation,3);
       // moveZeroes(rotation);
        moveZeroesNoExtraSpace(rotation);


    }

    public static void squareNumbers(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                square = nums[right];
                right--;
            } else {
                square = nums[left];
                left++;

            }
            result[i] = square * square;
        }
        for (int i : result) {
            System.out.print(i + ",");
        }
    }

    //rotateNumbers
    public static void rotateNumber(int[] nums, int k) {

        int[] result = new int[nums.length];
        int j = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            result[j] = nums[i];
            j++;
        }
        for (int left = 0; left < nums.length - k; left++) {
            result[j] = nums[left];
            j++;
        }


    }

    //move zeros to the end without losing the order
    public static void moveZeroes(int[] nums) {


        //brute force with extra space

        int j = nums.length - 1;
        int[] result = new int[nums.length];
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[c] = nums[i];
                c++;
            } else {
                result[j] = 0;
                j--;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            nums[k] = result[k];
            System.out.print(result[k] + ",");
        }

        //without using extra space



    }

    //move zeros to the end without losing the order without using extra space
    public static void moveZeroesNoExtraSpace(int[] nums) {

        int zerosPointer = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                temp = nums[zerosPointer];
                nums[zerosPointer] = nums[i];
                nums[i] = temp;
                zerosPointer++;
            }
        }

        for(int k : nums){
            System.out.print(k +",");
        }
    }
}
