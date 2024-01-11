package org.javaacadmey.toyota.car.factory;

import org.javaacadmey.toyota.car.cars.Price;
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
            Wheel[] wheels = assemblyWheels(factory, Camry.WHEEL_DIAMETER);
            return new Camry(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                    wheels, factory.createGasTank(), factory.createEngine(),
                    factory.createElectrics(), factory.createHeadlights(), true, price, country);

        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());;
        }
        return null;
    }

    public Car createSolara(String color, Price price) {
        try {
            Factory factory = chooseFactory();
            Wheel[] wheels = assemblyWheels(factory, Solara.WHEEL_DIAMETER);
            return new Solara(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                    wheels, factory.createGasTank(), factory.createEngine(),
                    factory.createElectrics(), factory.createHeadlights(), true, price, country);
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());;
        }
        return null;
    }

    public Car createHiance(String color, Price price) {
        try {
            Factory factory = chooseFactory();
            Wheel[] wheels = assemblyWheels(factory, Hiance.WHEEL_DIAMETER);
            return new Hiance(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                    wheels, factory.createGasTank(), factory.createEngine(),
                    factory.createElectrics(), factory.createHeadlights(), 25000, price, country);
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());;
        }
        return null;
    }

    public Car createDyna(String color, Price price) {
        try {
            Factory factory = chooseFactory();
            Wheel[] wheels = assemblyWheels(factory, Dyna.WHEEL_DIAMETER);
            return new Dyna(color, 125, TransmissionType.AUTOMATIC_TRANSMISSION.name(),
                    wheels, factory.createGasTank(), factory.createEngine(),
                    factory.createElectrics(), factory.createHeadlights(), 44000, price, country);
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());;
        }
        return null;
    }

    private Wheel[] assemblyWheels(Factory factory, int diameter) {
        Wheel[] wheels = new Wheel[Car.WHEEL_COUNT];
        for (int i = 0; i < Car.WHEEL_COUNT; i++) {
            wheels[i] = factory.createWheel(diameter);
        }
        return wheels;
    }

    private Factory chooseFactory() throws CountryFactoryNotEqualException {
        Factory choosenFactory = null;
        String wrongFactories = "";
        for (Factory factory : factories) {
            if (factory == null) {
                continue;
            }

            if (factory.getCountry().equals(this.country)) {
                choosenFactory = factory;
            } else {
                wrongFactories = String.join(", ", factory.getCountry().getName());
            }
        }
        if (choosenFactory != null) {
            return choosenFactory;
        } else {
            throw new CountryFactoryNotEqualException(String.format("Не совпавшие страны: %s.", wrongFactories));
        }
    }
}
