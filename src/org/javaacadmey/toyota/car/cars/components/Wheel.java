package org.javaacadmey.toyota.car.cars.components;

public class Wheel {
    private boolean isPunctured = false;
    private int diameter;

    public Wheel(int diameter) {
        this.diameter = diameter;
    }

    public boolean isPunctured() {
        return isPunctured;
    }

    public int getDiameter() {
        return diameter;
    }
}
