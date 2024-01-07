package org.javaacadmey.toyota.car.cars.models;

import org.javaacadmey.toyota.car.Countries;
import org.javaacadmey.toyota.car.cars.components.*;
import org.javaacadmey.toyota.car.cars.types.Cabriolet;

public class Solara extends Cabriolet {
    private static final boolean HAS_FRIDGE = true;
    public static final int WHEEL_DIAMETER = 16;

    public Solara(String color,
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

    }

    public void freezeDrink() {
        System.out.println("Напиток охладился");
    }
}
