package com.javadev.ces.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {3,2,4};
        int target = 6;
        int[] twoSum = findTwoSum(arr, target);
        System.out.println(Arrays.toString(twoSum));

    }
    //time complexity is O(n)
    //space complexity is O(n)
    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> prevElement= new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if(prevElement.containsKey(diff)) {
                return new int [] {prevElement.get(diff),i};
            }
            prevElement.put(num,i);
        }
        return new int [] {};
    }
}
