package org.javaacadmey.toyota.car.cars.types;

import org.javaacadmey.toyota.car.factory.Countries;
import org.javaacadmey.toyota.car.cars.Price;
import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.components.*;

public abstract class Passenger extends Car {
    private boolean hasCruise;

    public Passenger(String color,
                     int maxSpeed,
                     String transmission,
                     Wheel[] wheels,
                     GasTank gasTank,
                     Engine engine,
                     Electrics electrics,
                     Headlights headlights,
                     boolean hasCruise,
                     Price price,
                     Countries country) {
        super(color, maxSpeed, transmission, wheels, gasTank, engine, electrics, headlights, price, country);
        this.hasCruise = hasCruise;
    }

    public void changeCruise() {
        this.hasCruise = !this.hasCruise;
        System.out.println(this.hasCruise);
    }
}
