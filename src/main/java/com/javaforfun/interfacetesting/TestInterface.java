package com.javaforfun.interfacetesting;

import java.util.List;

/**
 * TestInterface
 */
public interface TestInterface {

    List<String> strLst = List.of("sajkl", "sdjfsd",":");
    // private String color = null; you cannot keep state in a interface

    public boolean isValidString(String str);

    public default String listToString(){
        return String.join("", strLst);
    }
}