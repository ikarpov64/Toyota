package org.javaacadmey.toyota.car.Cars.models;

import org.javaacadmey.toyota.car.Cars.types.Cargo;

public class Hiance extends Cargo {
    private static final boolean HAS_SPARE_WHEEL = true;
    private static final int wheelDiameter = 20;

    public Hiance(double loadCapacity) {
        super(loadCapacity);
    }
}
