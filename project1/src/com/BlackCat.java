package com;

public class BlackCat extends Cat{
    public BlackCat(String name, int age) {
        super(name, age, 350);
    }

    @Override
    public String toString() {
        return "BlackCat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cost=" + cost +
                '}';
    }
}
