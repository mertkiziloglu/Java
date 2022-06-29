package com.example.huaweicase;
public class Main {
    // YOUR CODE HERE
    // Please write your code here. This method is just a guideline for you to show how application will
    // be run and tested at the background. You are not limited this method only. You can design and develop
    // your own Object Oriented Code outside of this method also.
    public static int longestSubarray(int[] nums)
    {
        // Input: 0 1 1 1 0 1 1 0 1
        // Output: 5
        // Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].}

        int result = -1;

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        return result;
    }


    public static void main(String[] args) {
        // IMPORTANT DO NOT CHANGE CODE BLOCK INSIDE THIS
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }
        System.out.print(longestSubarray(array));
        // IMPORTANT DO NOT CHANGE CODE BLOCK INSIDE THIS
        //longest non empty subarray with all 1's
        // Input: 1 1 0 1
        // Output: 3
        // Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
        //longest non empty subarray with all 0's
        // Input: 0 1 1 1 0 1 1 0 1
        // Output: 5
        // Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
        //longest non empty subarray with all 1's
        // Input: 1 1 1
        // Output: 2
        // Explanation: You must delete one element.


    }
}

