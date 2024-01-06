package org.javaacadmey.toyota.car.cars.types;

import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.components.*;

public abstract class Cargo extends Car {
    private final double LOAD_CAPACITY;

    public Cargo(String color, int maxSpeed, String transmission, boolean isMoving, Wheel[] wheels, GasTank gasTank, Engine engine, Electrics electrics, Headlights headlights, double loadCapacity) {
        super(color, maxSpeed, transmission, isMoving, wheels, gasTank, engine, electrics, headlights);
        this.LOAD_CAPACITY = loadCapacity;
    }
}
