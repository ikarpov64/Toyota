package org.javaacadmey.toyota.car.cars.types;

import org.javaacadmey.toyota.car.Countries;
import org.javaacadmey.toyota.car.Price;
import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.components.*;

public abstract class Cargo extends Car {
    private final double LOAD_CAPACITY;

    public Cargo(String color,
                 int maxSpeed,
                 String transmission,
                 boolean isMoving,
                 Wheel[] wheels,
                 GasTank gasTank,
                 Engine engine,
                 Electrics electrics,
                 Headlights headlights,
                 double loadCapacity,
                 Price price,
                 Countries country) {
        super(color, maxSpeed, transmission,
                isMoving, wheels, gasTank, engine,
                electrics, headlights, price, country);
        this.LOAD_CAPACITY = loadCapacity;
    }
}
