package com.javadev.tdd.leetcode;

import com.javadev.leetcode.GroupAnagramCheck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagramTest {

    @Test
    public void checkGroupAnagramTest() {
        String [] input = {"eat","tea","nat","ate","tan","bat"};
        List<List<String>> output = new ArrayList<>();
        output.add(Arrays.asList("eat", "tea", "ate"));
        output.add(Arrays.asList("bat"));
        output.add(Arrays.asList("nat", "tan"));
        GroupAnagramCheck obj = new GroupAnagramCheck();
        Assertions.assertEquals(output, obj.groupAnagramCheck(input));
    }
}
