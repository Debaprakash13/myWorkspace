package com.javadev.practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSumPractise {
    public int[] doTwoSum(int[] inputArry, int target) {
        Map<Integer,Integer> prevElement = new HashMap<>();

        for(int i = 0; i < inputArry.length; i++) {
            int num = inputArry[i];
            int diff = target - num;

            if(prevElement.containsKey(diff)) {
                return new int [] {prevElement.get(diff), i};
            }
            prevElement.put(num,i);
        }

        throw new IllegalArgumentException("No element in the list add up to the target");
    }
}
