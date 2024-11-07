package com.javaforfun.lambdafunctions;

public interface GreeterFunctionalInterface {
    void printString();
    default void printStr() {
        System.out.println("hello! from default function");
    }
}
