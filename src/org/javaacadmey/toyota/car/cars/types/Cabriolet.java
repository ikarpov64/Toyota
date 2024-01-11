package org.javaacadmey.toyota.car.cars.types;


import org.javaacadmey.toyota.car.factory.Countries;
import org.javaacadmey.toyota.car.cars.Price;
import org.javaacadmey.toyota.car.cars.components.*;

public abstract class Cabriolet extends Passenger {
    private boolean roofOpen;

    public Cabriolet(String color,
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
        super(color, maxSpeed, transmission, wheels, gasTank,
                engine, electrics, headlights,
                hasCruise, price, country);
        this.roofOpen = false;
    }


    public void changeRoof() {
        this.roofOpen = !this.roofOpen;
    }
}
