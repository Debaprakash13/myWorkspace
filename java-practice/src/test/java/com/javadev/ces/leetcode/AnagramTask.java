package com.javadev.ces.leetcode;

public class AnagramTask {
    public boolean checkAnagram(String s, String t) {
        int [] frequency = new int[26];

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }

        for(int k = 0; k < frequency.length; k++) {
            if(frequency[k] != 0) {
                return false;
            }
        }
        return true;
    }
}
