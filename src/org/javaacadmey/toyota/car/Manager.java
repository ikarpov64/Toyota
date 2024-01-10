package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.CarColor;
import org.javaacadmey.toyota.car.exeptions.NoCarAvailableException;
import org.javaacadmey.toyota.car.factory.AssemblyLine;
import org.javaacadmey.toyota.car.warehouse.Warehouse;

public class Manager {
    private final String name;
    private final Report report;

    public Manager(String name) {
        this.name = name;
        this.report = new Report(name);
        System.out.println(report);
    }

    public Car sellCar(Customer customer, Warehouse warehouse, AssemblyLine assemblyLine) throws NoCarAvailableException {
        Car mostExpensiveCar = null;
        int customerMoney = customer.getAmountOfMoney();
        Price price = Price.getMaxCarBySellPrice(customerMoney);

        if (price == null) {
            System.out.println("Недостаточно денег на покупку.");
        } else {
            try {
                mostExpensiveCar = mostExpensiveCar(customerMoney, warehouse);
                customer.reduceAmountOfMoney(price.getSellPrice());
                System.out.println("Вы купили " + mostExpensiveCar);
            } catch (NoCarAvailableException e) {
                sendRequestForAssembly(price, assemblyLine, warehouse);
                return sellCar(customer, warehouse, assemblyLine);
            }
        }

        return mostExpensiveCar;
    }

    private Car mostExpensiveCar(int customerMoney, Warehouse warehouse) throws NoCarAvailableException {
        if (customerMoney >= Price.DYNA.getSellPrice() && warehouse.dynasQty() > 0) {
            return warehouse.getDyna();
        } else if (customerMoney >= Price.HIANCE.getSellPrice() && warehouse.hiancesQty() > 0) {
            return warehouse.getHiance();
        } else if (customerMoney >= Price.SOLARA.getSellPrice() && warehouse.solarasQty() > 0) {
            return warehouse.getSolara();
        } else if (customerMoney >= Price.CAMRY.getSellPrice() && warehouse.camrysQty() > 0) {
            return warehouse.getCamry();
        }
        throw new NoCarAvailableException("Нет машин в наличии");
    }

//    private Car findMostExpensiveCar(Warehouse warehouse, int budget) {
//        Car mostExpensiveCar = null;
//        if (warehouse.getCarQty() == 0) {
//            return mostExpensiveCar;
//        }
//
//        Car[][] cars = {
//                warehouse.getSolaras(), warehouse.getCamrys(),
//                warehouse.getDynas(), warehouse.getHiances()};
//
//        for (Car[] models : cars) {
//            for (Car car : models) {
//                if (car.getPrice().getSellPrice() <= budget &&
//                        (mostExpensiveCar == null ||
//                                car.getPrice().getSellPrice() > mostExpensiveCar.getPrice().getSellPrice())) {
//                    mostExpensiveCar = car;
//                }
//            }
//        }
//        return mostExpensiveCar;
//    }

    private void sendRequestForAssembly(Price price, AssemblyLine assemblyLine, Warehouse warehouse) {
        if (price == Price.DYNA) {
             warehouse.addDyna(assemblyLine.createDyna(CarColor.BLACK.getColorName(), price));
        } else if (price == Price.HIANCE) {
            warehouse.addHiance(assemblyLine.createHiance(CarColor.BLACK.getColorName(), price));
        } else if (price == Price.SOLARA) {
            warehouse.addSolara(assemblyLine.createSolara(CarColor.BLACK.getColorName(), price));
        } else {
            warehouse.addCamry(assemblyLine.createCamry(CarColor.BLACK.getColorName(), price));
        }
    }
}
