package org.javaacadmey.toyota.car.cars;

import org.javaacadmey.toyota.car.Countries;
import org.javaacadmey.toyota.car.cars.components.*;
import org.javaacadmey.toyota.car.exeptions.StartCarException;

public abstract class Car {
    public Countries country;
    private String color;
    private int maxSpeed;
    private String transmission;
    private boolean isMoving;
    private double cost;

    private Wheel[] wheels = new Wheel[4];
    private GasTank gasTank;
    private Engine engine;
    private Electrics electrics;
    private Headlights headlights;

    public Car(String color, int maxSpeed,
               String transmission, boolean isMoving,
               Wheel[] wheels, GasTank gasTank,
               Engine engine, Electrics electrics, Headlights headlights, double cost, Countries country) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.isMoving = isMoving;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
        this.cost = cost;
        this.country = country;
    }

    public void startMoving() {
        try {
            checkComponents();
        } catch (StartCarException e) {
            System.out.println(e.getMessage());
        }

        this.isMoving = true;
        System.out.println("Тачка едет.");
    }

    public void stopMoving() {
        this.isMoving = false;
        System.out.println("Тачка не едет.");
    }

    public void turnHeadlights() {
        System.out.println("Фары включены.");
    }

    private void checkComponents() throws StartCarException {
        checkElectrics();
        checkEngine();
        checkGas();
        checkWheels();
    }

    private void checkWheels() throws StartCarException {
        for (Wheel wheel : this.wheels) {
            if (wheel == null) {
                throw new StartCarException("Нет колеса");
            } else if (wheel.isPunctured()) {
                throw new StartCarException("Колесо проколото");
            }
        }
    }

    private void checkGas() throws StartCarException {
        if (this.gasTank.getGasQty() == 0) {
            throw new StartCarException("Нет бензина");
        }
    }

    private void checkEngine() throws StartCarException {
        if (!this.engine.isWorked()) {
            throw new StartCarException("Двигатель не але");
        }
    }

    private void checkElectrics() throws StartCarException {
        if (!this.electrics.isWorked()) {
            throw new StartCarException("Электрика не але");
        }
    }

    public double getCost() {
        return cost;
    }
}
