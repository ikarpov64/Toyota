package org.javaacadmey.toyota.car.cars.types;

import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.components.*;

public abstract class Passenger extends Car {
    private boolean hasCruise;

    public Passenger(String color, int maxSpeed, String transmission, boolean isMoving, Wheel[] wheels, GasTank gasTank, Engine engine, Electrics electrics, Headlights headlights, boolean hasCruise) {
        super(color, maxSpeed, transmission, isMoving, wheels, gasTank, engine, electrics, headlights);
        this.hasCruise = hasCruise;
    }

    public void changeCruise() {
        this.hasCruise = !this.hasCruise;
        System.out.println(this.hasCruise);
    }
}
