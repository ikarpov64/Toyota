package org.javaacadmey.toyota.car.cars.components;

public enum TransmissionType {

    AUTOMATIC_TRANSMISSION("АКПП"),
    MANUAL_TRANSMISSION("Механика"),
    ROBOTIC_TRANSMISSION("Робот");

    private final String type;

    TransmissionType(String type) {
        this.type = type;
    }
}
