package org.javaacadmey.toyota.car.Cars.models;

import org.javaacadmey.toyota.car.Cars.types.Passenger;

public class Camry extends Passenger {
    private static final boolean HAS_USB = true;
    private static final int wheelDiameter = 17;

    public Camry(boolean hasCruise) {
        super(hasCruise);
    }


    public void playMusic() {
        System.out.println("Музыка играет.");
    }
}
