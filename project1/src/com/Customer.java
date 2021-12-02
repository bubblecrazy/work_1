package com;

import java.time.LocalDate;
import java.time.LocalTime;

public class Customer {
    protected String name;
    protected int times;
    protected LocalDate time;

    public Customer(String name, int times, LocalDate time) {
        this.name = name;
        this.times = times;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", how many times = " + times +
                ", time=" + time +
                '}';
    }
}
