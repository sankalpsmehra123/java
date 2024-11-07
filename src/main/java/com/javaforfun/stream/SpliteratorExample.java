package com.javaforfun.stream;

import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Spliterator<Integer> spliterator = numbers.spliterator();

        // Iterate over the elements using tryAdvance()
        while (spliterator.tryAdvance(System.out::println))
            ;
    }
}