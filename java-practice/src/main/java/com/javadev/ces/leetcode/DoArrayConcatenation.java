package com.javadev.ces.leetcode;

import java.util.Arrays;

public class DoArrayConcatenation {
    public static void main(String[] args) {
        int [] arr = {1,2,3};

        int [] arrResult = doConcatenation(arr);
        System.out.println(Arrays.toString(arrResult));
    }

    private static int[] doConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
