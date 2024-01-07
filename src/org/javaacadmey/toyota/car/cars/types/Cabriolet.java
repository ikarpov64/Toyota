package org.javaacadmey.toyota.car.cars.types;


import org.javaacadmey.toyota.car.Countries;
import org.javaacadmey.toyota.car.cars.components.*;

public abstract class Cabriolet extends Passenger {
    private boolean roofOpen;

    public Cabriolet(String color,
                     int maxSpeed,
                     String transmission,
                     boolean isMoving,
                     Wheel[] wheels,
                     GasTank gasTank,
                     Engine engine,
                     Electrics electrics,
                     Headlights headlights,
                     boolean hasCruise,
                     double cost,
                     Countries country) {
        super(color, maxSpeed, transmission,
                isMoving, wheels, gasTank,
                engine, electrics, headlights,
                hasCruise, cost, country);
        this.roofOpen = false;
    }


    public void changeRoof() {
        this.roofOpen = !this.roofOpen;
    }
}
