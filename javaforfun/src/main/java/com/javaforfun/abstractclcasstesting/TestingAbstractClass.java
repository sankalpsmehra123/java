package com.javaforfun.abstractclcasstesting;

import java.util.List;

public abstract class TestingAbstractClass {

    List<String> strLst = List.of("sajkl", "sdjfsd",":");
    // private String color = null; you cannot keep state in a interface


    public abstract boolean isValidString(String str);

    public String listToString(){
        return String.join("", strLst);
    }
    
}
