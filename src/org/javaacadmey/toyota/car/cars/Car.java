package org.javaacadmey.toyota.car.cars;

import org.javaacadmey.toyota.car.factory.Countries;
import org.javaacadmey.toyota.car.cars.components.*;
import org.javaacadmey.toyota.car.exeptions.StartCarException;

public abstract class Car {
    public static final int WHEEL_COUNT = 4;
    private Countries country;
    private String color;
    private int maxSpeed;
    private String transmission;
    private boolean isMoving = false;
    private Price price;
    private Wheel[] wheels;
    private GasTank gasTank;
    private Engine engine;
    private Electrics electrics;
    private Headlights headlights;

    public Car(String color, int maxSpeed,
               String transmission,
               Wheel[] wheels, GasTank gasTank,
               Engine engine, Electrics electrics, Headlights headlights, Price price, Countries country) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.wheels = wheels;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electrics = electrics;
        this.headlights = headlights;
        this.price = price;
        this.country = country;
    }

    public void startMoving() {
        try {
            checkComponents();
            this.isMoving = true;
            System.out.println("Компоненты в рабочем состоянии. Автомобиль запущен и едет.");
        } catch (StartCarException e) {
            System.out.println(e.getMessage() + " Движение невозможно.");
        }
    }

    public void stopMoving() {
        this.isMoving = false;
        System.out.println("Автомобиль остановлен.");
    }

    public void turnHeadlights() {
        try {
            checkElectrics();
            System.out.println("Фары включены и светят.");
        } catch (StartCarException e) {
            System.out.printf("Невозможно включить фары. %s.\n", e.getMessage());;
        }
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
                throw new StartCarException("У автомобиля отсутствует колесо.");
            } else if (wheel.isPunctured()) {
                throw new StartCarException("У автомобиля проколото колесо.");
            }
        }
    }

    private void checkGas() throws StartCarException {
        if (this.gasTank.getGasQty() == 0) {
            throw new StartCarException("Бак пуст.");
        }
    }

    private void checkEngine() throws StartCarException {
        if (!this.engine.isWorked()) {
            throw new StartCarException("Двигатель не работает.");
        }
    }

    private void checkElectrics() throws StartCarException {
        if (!this.electrics.isWorked()) {
            throw new StartCarException("Электрика не работает.");
        }
    }

    public Price getPrice() {
        return price;
    }

}
