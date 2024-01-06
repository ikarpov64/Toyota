package org.javaacadmey.toyota.car.Cars.types;

public abstract class Passenger {
    private boolean hasCruise;

    public Passenger(boolean hasCruise) {
        this.hasCruise = hasCruise;
    }

    public void change_cruise() {
        this.hasCruise = !this.hasCruise;
    }
}
