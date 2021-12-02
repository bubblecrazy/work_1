package com;

import groovy.lang.GString;

public abstract class Cat {
    protected String name;
    protected int age;
    protected double cost;

    public Cat(String name, int age, double cost) {
        this.name = name;
        this.age = age;
        this.cost = cost;
    }

    @Override
    public abstract  String toString();
}
