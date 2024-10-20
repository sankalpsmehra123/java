package com.javaforfun.interfacetesting;

public class Logger implements Log{

    @Override
    public boolean log() {
        lst.add("san");
        lst.remove("san");
        throw new UnsupportedOperationException("Unimplemented method 'log'");
    }
    

}
