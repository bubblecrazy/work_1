package com;

public class CatNotFoundException extends RuntimeException {
    public CatNotFoundException(String s) {
        super(s);
    }
}
