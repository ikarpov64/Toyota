package org.javaacadmey.toyota.car.Cars.components;

public enum Transmission {

    AUTOMATIC_TRANSMISSION("АКПП"),
    MANUAL_TRANSMISSION("Механика"),
    ROBOTIC_TRANSMISSION("Робот");

    private final String type;

    Transmission(String type) {
        this.type = type;
    }
}
