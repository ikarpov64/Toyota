package org.javaacadmey.toyota.car.factory;

import org.javaacadmey.toyota.car.cars.components.*;

public class Factory {
    String Country;

    protected Electrics createElectrics() {
        return new Electrics();
    }

    protected Engine createEngine() {
        return new Engine();
    }

    protected GasTank createGasTank() {
        return new GasTank();
    }

    protected Headlights createHeadlights() {
        return new Headlights();
    }

    protected Wheel createWheel(int wheelDiameter) {
        return new Wheel(wheelDiameter);
    }
}
