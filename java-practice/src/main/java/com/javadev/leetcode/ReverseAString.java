package com.javadev.leetcode;

public class ReverseAString {
    public static void main(String[] args) {
        String input = "hello";
        char[] s = input.toCharArray();

        String reversedString = doReverseApp1(s);
        System.out.println(reversedString);

        String revString = doReverseApp1(s);
        System.out.println(revString);

        String revString2 = doReverseApp2(s);
        System.out.println(revString2);
        }

    private static String doReverseUsingStringBuilder(String input) {
        StringBuilder builder = new StringBuilder();
        builder.append(input);
        return builder.reverse().toString();
    }

    private static String doReverseApp1(char[] s) {
        String output = "";

        for(int i = s.length-1; i>=0;i--) {
           output = output + s[i];
        }

        return output;
    }

    private static String doReverseApp2(char[] s) {
        StringBuilder output = new StringBuilder();

        for(int i = s.length-1; i>=0;i--) {
            output.append(s[i]);
        }

        return output.toString();
    }
}
