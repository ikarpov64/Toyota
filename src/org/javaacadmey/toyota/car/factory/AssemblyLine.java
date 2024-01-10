package org.javaacadmey.toyota.car.factory;

import org.javaacadmey.toyota.car.Countries;
import org.javaacadmey.toyota.car.Price;
import org.javaacadmey.toyota.car.cars.Car;
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

    public Car createCamry(String color, double price) {
        Wheel[] wheels = assemblyWheels(Camry.WHEEL_DIAMETER, 4);
        return new Camry(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), true, Price.CAMRY, country);
    }

    public Car createSolara(String color, double price) {
        Wheel[] wheels = assemblyWheels(Solara.WHEEL_DIAMETER, 4);
        return new Solara(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), true, Price.SOLARA, country);
    }

    public Car createHiance(String color, double price) {
        Wheel[] wheels = assemblyWheels(Hiance.WHEEL_DIAMETER, 4);
        return new Hiance(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), 25000, Price.HIANCE, country);
    }

    public Car createDyna(String color, double price) {
        Wheel[] wheels = assemblyWheels(Dyna.WHEEL_DIAMETER, 4);
        return new Dyna(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), 44000, Price.DYNA, country);
    }

    private Wheel[] assemblyWheels(int diameter, int wheelCount) {
        Wheel[] wheels = new Wheel[wheelCount];
        for (Wheel wheel : wheels) {
            wheel = Factory.createWheel(diameter);
        }
        return wheels;
    }
}
