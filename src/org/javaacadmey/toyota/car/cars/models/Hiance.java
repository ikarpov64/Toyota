package org.javaacadmey.toyota.car.cars.models;

import org.javaacadmey.toyota.car.factory.Countries;
import org.javaacadmey.toyota.car.cars.Price;
import org.javaacadmey.toyota.car.cars.components.*;
import org.javaacadmey.toyota.car.cars.types.Cargo;

public class Hiance extends Cargo {
    private static final boolean HAS_SPARE_WHEEL = true;
    public static final int WHEEL_DIAMETER = 20;

    public Hiance(String color,
                  int maxSpeed,
                  String transmission,
                  Wheel[] wheels,
                  GasTank gasTank,
                  Engine engine,
                  Electrics electrics,
                  Headlights headlights,
                  double loadCapacity,
                  Price price,
                  Countries country) {
        super(color, maxSpeed, transmission,
                wheels, gasTank,
                engine, electrics, headlights,
                loadCapacity, price, country);

    }
}
