package org.javaacadmey.toyota.car.Cars.models;

import org.javaacadmey.toyota.car.Cars.types.Cabriolet;

public class Solara extends Cabriolet {
    private static final boolean HAS_FRIDGE = true;
    private static final int wheelDiameter = 16;

    public Solara(boolean roofOpen, boolean hasCruise) {
        super(roofOpen, hasCruise);
    }

    public void freezeDrink() {
        System.out.println("Напиток охладился");
    }
}
