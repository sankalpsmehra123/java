package com.javaforfun.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public String reverseWords(String s) {
        return String.join(" ", Arrays.asList(s.trim().split(" ")).reversed()
                .stream().map(String::trim).filter(str -> !str.isEmpty()).collect(Collectors.toList()));
    }
}
