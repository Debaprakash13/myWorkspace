package com.javadev.ces.tdd.leetcode;

import com.javadev.ces.leetcode.AnagramTask;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidAnagramTest {

    @Test
    public void checkAnagramTest () {
        String s = "cat";
        String t = "tar";
        boolean result = true;

        AnagramTask obj = new AnagramTask();
        Assertions.assertEquals(result, obj.checkAnagram(s,t));
    }
}
