package com.javadev.tdd.practise;

import com.javadev.practise.TwoSumPractise;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTwoSumPractise {

    @Test
    public void testTwoSum() {
        int [] inputArry = {2,3,4,7};
        int target = 7;
        int [] resultArry= {1,2};

        TwoSumPractise obj = new TwoSumPractise();
        Assertions.assertArrayEquals(resultArry,obj.doTwoSum(inputArry,target));
    }
}
