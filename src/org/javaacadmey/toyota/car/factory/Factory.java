package org.javaacadmey.toyota.car.factory;

import org.javaacadmey.toyota.car.Countries;
import org.javaacadmey.toyota.car.cars.components.*;

public class Factory {
    Countries country;

    public Factory(Countries country) {
        this.country = country;
    }

    public Electrics createElectrics() {
        return new Electrics();
    }

    public Engine createEngine() {
        return new Engine();
    }

    public GasTank createGasTank() {
        return new GasTank();
    }

    public Headlights createHeadlights() {
        return new Headlights();
    }

    public Wheel createWheel(int wheelDiameter) {
        return new Wheel(wheelDiameter);
    }

    @Override
    public String toString() {
        return "Factory{" +
                "country=" + country +
                '}';
    }

    public Countries getCountry() {
        return country;
    }
}

