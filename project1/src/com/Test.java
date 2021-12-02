package com;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        MyCatCafe a = new MyCatCafe("a",300);
        MyCatCafe b = new MyCatCafe("b",300);
        MyCatCafe c = new MyCatCafe("c",300);
        BlackCat West1 = new BlackCat("West1",1);
        OrangeCat East1 = new OrangeCat("East1",2,true);
        Customer South1 = new Customer("South1",10,now);
        Customer South2 = new Customer("South2",30,now);
        a.buyNewCat(West1);
        b.buyNewCat(East1);
        c.buyNewCat(East1);
        b.serveCustomer(South1);
        c.serveCustomer(South2);
        b.buyNewCat(West1);
        c.buyNewCat(West1);
        a.Rest();
        b.Rest();
        c.Rest();
    }
}
