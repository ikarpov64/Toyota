package org.javaacadmey.toyota.car.cars.models;

import org.javaacadmey.toyota.car.factory.Countries;
import org.javaacadmey.toyota.car.cars.Price;
import org.javaacadmey.toyota.car.cars.components.*;
import org.javaacadmey.toyota.car.cars.types.Passenger;

public class Camry extends Passenger {
    private static final boolean HAS_USB = true;
    public static final int WHEEL_DIAMETER = 17;

    public Camry(String color,
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
        super(color, maxSpeed, transmission,
                wheels, gasTank, engine,
                electrics, headlights, hasCruise,
                price, country);
    }

    public void playMusic() {
        System.out.println("Музыка играет.");
    }
}
