package org.javaacadmey.toyota.car.cars.types;

import org.javaacadmey.toyota.car.Countries;
import org.javaacadmey.toyota.car.Price;
import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.components.*;

public abstract class Passenger extends Car {
    private boolean hasCruise;

    public Passenger(String color,
                     int maxSpeed,
                     String transmission,
                     boolean isMoving,
                     Wheel[] wheels,
                     GasTank gasTank,
                     Engine engine,
                     Electrics electrics,
                     Headlights headlights,
                     boolean hasCruise,
                     Price price,
                     Countries country) {
        super(color, maxSpeed, transmission, isMoving, wheels, gasTank, engine, electrics, headlights, price, country);
        this.hasCruise = hasCruise;
    }

    public void changeCruise() {
        this.hasCruise = !this.hasCruise;
        System.out.println(this.hasCruise);
    }
}
