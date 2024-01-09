package org.javaacadmey.toyota.car.factory;

import org.javaacadmey.toyota.car.Countries;
import org.javaacadmey.toyota.car.cars.components.*;

public class Factory {
    Countries country;

    @Override
    public String toString() {
        return "Factory{" +
                "country=" + country +
                '}';
    }

    public Factory(Countries country) {
        this.country = country;
        createElectrics();
    }

    public static Electrics createElectrics() {
        return new Electrics();
    }

    public static  Engine createEngine() {
        return new Engine();
    }

    public static  GasTank createGasTank() {
        return new GasTank();
    }

    public static  Headlights createHeadlights() {
        return new Headlights();
    }

    public static  Wheel createWheel(int wheelDiameter) {
        return new Wheel(wheelDiameter);
    }
}
