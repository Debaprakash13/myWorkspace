package com.javadev.ces.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Streams {
    public static void main (String [] args) {
        List<Integer> numbers = Arrays.asList(12,232,2324,56,9,345,45,11,23);

        //filter all numbers greater than 9
        //sort them descending order

        numbers.stream().filter(integer -> integer > 9).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //find frequency of characters in a string using streams
        String name = "Debaprakash";
        Map<String, Long> collect = Arrays.stream(name.split("")).collect(groupingBy(Function.identity(), counting()));
        System.out.println(collect);
    }
}
