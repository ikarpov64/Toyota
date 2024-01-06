package org.javaacadmey.toyota.car.Cars.types;


public abstract class Cabriolet extends Passenger {
    private boolean roofOpen;

    public Cabriolet(boolean roofOpen, boolean hasCruise) {
        super(hasCruise);
        this.roofOpen = roofOpen;
    }


    public void changeRoof() {
        this.roofOpen = !this.roofOpen;
    }
}
