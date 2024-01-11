package org.javaacadmey.toyota.car.cars.models;

import org.javaacadmey.toyota.car.factory.Countries;
import org.javaacadmey.toyota.car.cars.Price;
import org.javaacadmey.toyota.car.cars.components.*;
import org.javaacadmey.toyota.car.cars.types.Cabriolet;

public class Solara extends Cabriolet {
    private static final boolean HAS_FRIDGE = true;
    public static final int WHEEL_DIAMETER = 16;

    public Solara(String color,
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
                wheels, gasTank,
                engine, electrics, headlights,
                hasCruise, price, country);

    }

    public void freezeDrink() {
        System.out.println("Напиток охладился.");
    }
}
