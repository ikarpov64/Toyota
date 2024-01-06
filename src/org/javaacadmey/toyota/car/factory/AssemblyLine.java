package org.javaacadmey.toyota.car.factory;

import org.javaacadmey.toyota.car.cars.components.TransmissionType;
import org.javaacadmey.toyota.car.cars.components.Wheel;
import org.javaacadmey.toyota.car.cars.models.Camry;
import org.javaacadmey.toyota.car.cars.models.Dyna;
import org.javaacadmey.toyota.car.cars.models.Hiance;
import org.javaacadmey.toyota.car.cars.models.Solara;

public class AssemblyLine extends Factory {


    public Camry createCamry(String color, double price) {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel : wheels) {
            wheel = new Wheel(Camry.WHEEL_DIAMETER);
        }
        Camry camry = new Camry(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, createGasTank(), createEngine(),
                createElectrics(), createHeadlights(), true);
        return camry;
    }

    public Solara createSolara(String color, double price) {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel : wheels) {
            wheel = new Wheel(Camry.WHEEL_DIAMETER);
        }
        Solara solara = new Solara(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, createGasTank(), createEngine(),
                createElectrics(), createHeadlights(), true);
        return solara;
    }

    public Hiance createHiance(String color, double price) {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel : wheels) {
            wheel = new Wheel(Camry.WHEEL_DIAMETER);
        }
        Hiance hiance = new Hiance(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, createGasTank(), createEngine(),
                createElectrics(), createHeadlights(), 25000);
        return hiance;
    }

    public Dyna createDyna(String color, double price) {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel : wheels) {
            wheel = new Wheel(Camry.WHEEL_DIAMETER);
        }
        Dyna dyna = new Dyna(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, createGasTank(), createEngine(),
                createElectrics(), createHeadlights(), 44000);
        return dyna;
    }
}
