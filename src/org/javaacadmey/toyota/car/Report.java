package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.cars.Car;

import java.util.Arrays;

public class Report {
    private final String managerName;
    private Car[] cars = new Car[0];

    public Report(String manager) {
        this.managerName = manager;
    }

    public void addCarToReport(Car car) {
        if (car != null) {
            cars = Arrays.copyOf(cars, cars.length + 1);
            cars[cars.length - 1] = car;
            System.out.println(cars.length);
        }
    }
}
