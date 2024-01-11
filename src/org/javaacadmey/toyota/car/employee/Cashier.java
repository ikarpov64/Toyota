package org.javaacadmey.toyota.car.employee;

import org.javaacadmey.toyota.car.cars.Car;

import java.util.Arrays;

public class Cashier {
    private static Car[] income = new Car[0];

    public void addIncome(Car car) {
        if (car != null) {
            income = Arrays.copyOf(income, income.length + 1);
            income[income.length - 1] = car;
        }
    }

    public int getIncomeSum() {
        int sum = 0;
        for (Car car : income) {
            sum += car.getPrice().getSellPrice();
        }
        return sum;
    }
}
