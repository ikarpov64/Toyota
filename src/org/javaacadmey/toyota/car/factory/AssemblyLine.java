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
import org.javaacadmey.toyota.car.exeptions.CountryFactoryNotEqualException;

public class AssemblyLine {
        Countries country;
        Factory[] factories;

    public AssemblyLine(Countries country, Factory[] factories) {
        this.country = country;
        this.factories = factories;
    }

    public Car createCamry(String color, Price price) {
        try {
            Factory factory = chooseFactory();
            Wheel[] wheels = assemblyWheels(Camry.WHEEL_DIAMETER, 4);
            return new Camry(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                    false, wheels, factory.createGasTank(), factory.createEngine(),
                    factory.createElectrics(), factory.createHeadlights(), true, price, country);

        } catch (CountryFactoryNotEqualException e) {
            throw new RuntimeException(e);
        }
    }

    private Factory chooseFactory() throws CountryFactoryNotEqualException {
        for (Factory factory : factories) {
            if (factory.getCountry().equals(this.country)) {
                return factory;
            }
        }
        throw new CountryFactoryNotEqualException("Нет фабрики для производства компонентов.");
    }

    public Car createSolara(String color, Price price) {
        Wheel[] wheels = assemblyWheels(Solara.WHEEL_DIAMETER, 4);
        return new Solara(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), true, price, country);
    }

    public Car createHiance(String color, Price price) {
        Wheel[] wheels = assemblyWheels(Hiance.WHEEL_DIAMETER, 4);
        return new Hiance(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), 25000, price, country);
    }

    public Car createDyna(String color, Price price) {
        Wheel[] wheels = assemblyWheels(Dyna.WHEEL_DIAMETER, 4);
        return new Dyna(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                false, wheels, Factory.createGasTank(), Factory.createEngine(),
                Factory.createElectrics(), Factory.createHeadlights(), 44000, price, country);
    }

    private Wheel[] assemblyWheels(int diameter, int wheelCount) {
        Wheel[] wheels = new Wheel[wheelCount];
        for (Wheel wheel : wheels) {
            wheel = Factory.createWheel(diameter);
        }
        return wheels;
    }
}
