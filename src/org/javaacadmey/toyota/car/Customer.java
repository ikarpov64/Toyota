package org.javaacadmey.toyota.car;

public class Customer {
    private final String name;
    private double amountOfMoney;

    public Customer(String name, int amountOfMoney) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
    }

    public String getName() {
        return name;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void reduceAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney -= amountOfMoney;
    }
}
