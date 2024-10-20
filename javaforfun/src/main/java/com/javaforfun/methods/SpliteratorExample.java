package com.javaforfun.methods;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Spliterator<Integer> spliterator = numbers.spliterator();

        // Iterate over the elements using tryAdvance()
        while (spliterator.tryAdvance(System.out::println))
            ;
    }
}