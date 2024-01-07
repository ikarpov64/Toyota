package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.cars.Car;

public class Manager {
    public Car sellCar(Customer customer) {
        int customerMoney = customer.getAmountOfMoney();
        Price price = checkMostExpensiveCar(customerMoney);

    }

    private Price checkMostExpensiveCar(int customerMoney) {
        if (customerMoney >= Price.DYNA.getSellPrice()) {
            if ();
        }
    }
}
