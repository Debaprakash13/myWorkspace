    package com.javadev.ces.leetcode;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.List;

    public class GroupAnagramCheck {
        public List<List<String>> groupAnagramCheck(String [] input) {
            List<List<String>> output = new ArrayList<>();

            if(input.length == 0)  return output;
            HashMap<String,List<String>> map = new HashMap<>();

            for(String s: input) {
                int[] hash = new int[26];
                for (char c : s.toCharArray()) {
                    hash[c - 'a']++;
                }
                String key = new String(Arrays.toString(hash));
                map.computeIfAbsent(key, k -> new ArrayList<>());
                map.get(key).add(s);
            }
            output.addAll(map.values());
            return output;
            }
        }
