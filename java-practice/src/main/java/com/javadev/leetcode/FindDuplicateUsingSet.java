package com.javadev.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingSet {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4};
        FindDuplicateUsingSet obj = new FindDuplicateUsingSet();
        boolean duplicateItemFound = obj.findDuplicate(arr);
        System.out.println("Duplicate item : " + duplicateItemFound);
    }


    private boolean findDuplicate(int[] arr) {
        Set<Integer> filteredList = new HashSet<>();
        for(int i=0; i < arr.length; i++) {
            if(filteredList.contains(arr[i])) {
                return true;
            }
            filteredList.add(arr[i]);
        }
        return false;
    }
}
