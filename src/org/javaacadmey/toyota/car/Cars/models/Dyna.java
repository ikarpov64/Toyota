package org.javaacadmey.toyota.car.Cars.models;

import org.javaacadmey.toyota.car.Cars.types.Cargo;

public class Dyna extends Cargo {
    private static final boolean HAS_SOCKET = true;
    private static final int wheelDiameter = 20;

    public Dyna(double loadCapacity) {
        super(loadCapacity);
    }

    public void chargePhone() {
        System.out.println("Телефон заряжается");
    }
}
