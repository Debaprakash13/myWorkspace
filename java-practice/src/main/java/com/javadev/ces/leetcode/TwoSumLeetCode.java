package com.javadev.ces.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetCode {
    public int[] doTwoSum(int[] inputArr, int target) {
        Map<Integer, Integer> prevElement = new HashMap<>();
        for(int i=0;i < inputArr.length; i++) {
            int num = inputArr[i];
            int diff = target - inputArr[i];

            if(prevElement.containsKey(diff)) {
                return new int [] {prevElement.get(diff),i};
            }
            prevElement.put(num,i);
        }
        throw new IllegalArgumentException("No two numbers add up to the target");
    }
}
