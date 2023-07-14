package com.javadev.ces.leetcode;

public class FindDuplicateUsingForLoop {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4};
        FindDuplicateUsingForLoop obj = new FindDuplicateUsingForLoop();
        int duplicateItem = obj.findDuplicate(arr);
        System.out.println("Duplicate item : " + duplicateItem);
    }

    //time compplexity O(n^2) where n is the size of the input array.  as we have compared each number with each other
    //space complexity O(1) which means the space required by the algorithm to process data is constant
    private int findDuplicate(int[] arr) {
        int result = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return result;
    }
}
