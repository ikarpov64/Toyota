package org.javaacadmey.toyota.car;

public class Customer {
    private String name;
    private int amountOfMoney;

    public Customer(String name, int amountOfMoney) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }
}
