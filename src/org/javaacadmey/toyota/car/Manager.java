package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.CarColor;
import org.javaacadmey.toyota.car.factory.AssemblyLine;
import org.javaacadmey.toyota.car.warehouse.Warehouse;

public class Manager {
    public Car sellCar(Customer customer, Warehouse warehouse, AssemblyLine assemblyLine) {
        Car mostExpensiveCar = null;
        int customerMoney = customer.getAmountOfMoney();
        Price price = Price.getMaxCarBySellPrice(customerMoney);
        if (price == null) {
            System.out.println("Недостаточно денег на покупку.");
        } else {
            mostExpensiveCar = findMostExpensiveCar(warehouse, customerMoney);
            if (mostExpensiveCar == null) {
                sendRequestForAssembly(price, assemblyLine, warehouse);
                mostExpensiveCar = sellCar(customer, warehouse, assemblyLine);
            }
        }

        return mostExpensiveCar;
    }

    private Car findMostExpensiveCar(Warehouse warehouse, int budget) {
        Car mostExpensiveCar = null;
        if (warehouse.getCarQty() == 0) {
            return mostExpensiveCar;
        }

        Car[][] cars = {
                warehouse.getSolaras(), warehouse.getCamrys(),
                warehouse.getDynas(), warehouse.getHiances()};

        for (Car[] models : cars) {
            for (Car car : models) {
                if (car.getCost() <= budget &&
                        (mostExpensiveCar == null || car.getCost() > mostExpensiveCar.getCost())) {
                    mostExpensiveCar = car;
                }
            }
        }
        return mostExpensiveCar;
    }

    private void sendRequestForAssembly(Price price, AssemblyLine assemblyLine, Warehouse warehouse) {
        if (price == Price.DYNA) {
             warehouse.addDyna(assemblyLine.createDyna(CarColor.BLACK.getColorName(), price.getSellPrice()));
        } else if (price == Price.HIANCE) {
            warehouse.addHiance(assemblyLine.createHiance(CarColor.BLACK.getColorName(), price.getSellPrice()));
        } else if (price == Price.SOLARA) {
            warehouse.addSolara(assemblyLine.createSolara(CarColor.BLACK.getColorName(), price.getSellPrice()));
        } else if (price == Price.CAMRY) {
            warehouse.addCamry(assemblyLine.createCamry(CarColor.BLACK.getColorName(), price.getSellPrice()));
        }
    }
}
