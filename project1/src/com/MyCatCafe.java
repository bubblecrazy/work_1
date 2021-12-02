package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class MyCatCafe implements PetShop{
    private String name;
    private double balance;
    private int total=0;
    private ArrayList<Cat> catList = new ArrayList<>(20);
    private ArrayList<Customer> customerList = new ArrayList<>(20);

    public MyCatCafe(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public MyCatCafe(double balance) {
        this.balance = balance;
    }

    @Override
    public void buyNewCat(Cat cat) {
        try {
            if (this.balance < cat.cost ) {
                throw new InsufficientBalanceException(cat.name);
            } else {
                this.balance -= cat.cost;
                catList.add(cat);
                System.out.println(name+":"+"购买" + cat.name );
            }
        } catch (InsufficientBalanceException error) {
            System.out.println(name+":"+"余额不足");
        }
    }

    @Override
    public void serveCustomer(Customer customer) {
        try {
            if (catList.size() == 0) {
                throw new CatNotFoundException(name+":"+"没找到猫");
            } else {
                customerList.add(customer);
                System.out.println(name+":"+customer.name + "来rua猫了\n" + "猫的信息为:");
                Random rand = new Random();
                for (int i = 0; i < customer.times; i++) {
                    int randNum = rand.nextInt(catList.size());
                    System.out.println(catList.get(randNum).toString());
                }
                this.balance += customer.times * 15;
            }
        } catch (CatNotFoundException e) {
            System.out.println(name+":"+"没找到猫");
        }
    }

    @Override
    public void Rest() {
        LocalDate now = LocalDate.now();
        System.out.println(name+":"+"今天已歇业");
        for (Customer i:customerList){
            if (i.time.isEqual(now) ){
                System.out.println(i.toString());
                this.total+=i.times;
            }
        }
        System.out.println(name+":"+"本日收入为:" + this.total*15);
    }

}
