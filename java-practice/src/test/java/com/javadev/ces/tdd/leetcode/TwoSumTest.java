package com.javadev.ces.tdd.leetcode;

import com.javadev.ces.leetcode.TwoSumLeetCode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        int [] inputArr = {3,2,4};
        int target = 6;
        int [] desiredIndices = {1,2};

        TwoSumLeetCode test = new TwoSumLeetCode();
        int [] output = test.doTwoSum(inputArr, target);

        Assertions.assertArrayEquals(desiredIndices, output);
    }
}
