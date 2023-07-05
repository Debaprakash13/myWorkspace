package com.javadev.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;

        int [] result = findTwoSumIndicies(arr,target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findTwoSumIndicies(int[] nums, int target) {
        Map<Integer, Integer> preMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if(preMap.containsKey(diff)) {
                return new int [] {preMap.get(diff), i};
            }
            preMap.put(num,i);
        }
        return new int [] {};
    }
}
