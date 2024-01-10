package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.cars.Car;

public class Report {
    private final Manager manager;
    private final Car[] cars = new Car[0];

    public Report(Manager manager) {
        this.manager = manager;
    }
}
