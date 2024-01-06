package org.javaacadmey.toyota.car.cars.models;

import org.javaacadmey.toyota.car.cars.components.*;
import org.javaacadmey.toyota.car.cars.types.Cargo;

public class Hiance extends Cargo {
    private static final boolean HAS_SPARE_WHEEL = true;
    public static final int WHEEL_DIAMETER = 20;


    public Hiance(String color, int maxSpeed, String transmission, boolean isMoving, Wheel[] wheels, GasTank gasTank, Engine engine, Electrics electrics, Headlights headlights, double loadCapacity) {
        super(color, maxSpeed, transmission, isMoving, wheels, gasTank, engine, electrics, headlights, loadCapacity);

    }
}
