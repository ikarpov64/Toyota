package org.javaacadmey.toyota.car.factory;

import org.javaacadmey.toyota.car.Countries;
import org.javaacadmey.toyota.car.cars.components.TransmissionType;
import org.javaacadmey.toyota.car.cars.components.Wheel;
import org.javaacadmey.toyota.car.cars.models.Camry;
import org.javaacadmey.toyota.car.cars.models.Dyna;
import org.javaacadmey.toyota.car.cars.models.Hiance;
import org.javaacadmey.toyota.car.cars.models.Solara;

public class AssemblyLine {
        Countries country;


    public AssemblyLine(Countries country) {
        this.country = country;
    }

    public Camry createCamry(String color, double price) {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel : wheels) {
            wheel = Factory.createWheel(Camry.WHEEL_DIAMETER);
        }
        Camry camry = new Camry(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), true, price, country);
        return camry;
    }

    public Solara createSolara(String color, double price) {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel : wheels) {
            wheel = Factory.createWheel(Solara.WHEEL_DIAMETER);
        }
        Solara solara = new Solara(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), true, price, country);
        return solara;
    }

    public Hiance createHiance(String color, double price) {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel : wheels) {
            wheel = Factory.createWheel(Hiance.WHEEL_DIAMETER);
        }
        Hiance hiance = new Hiance(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), 25000, price, country);
        return hiance;
    }

    public Dyna createDyna(String color, double price) {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel : wheels) {
            wheel = Factory.createWheel(Dyna.WHEEL_DIAMETER);
        }
        Dyna dyna = new Dyna(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), 44000, price, country);
        return dyna;
    }
}
