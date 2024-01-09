package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.warehouse.Warehouse;

public class Manager {
    public void sellCar(Customer customer, Warehouse warehouse) {
        int customerMoney = customer.getAmountOfMoney();
        Price price = checkMostExpensiveCar(customerMoney);
//        Car carForSale = checkAvailableCar(price, warehouse);
        if (price == null) {
            System.out.println("Не достаточно денег на покупку.");
        }
    }

    private Price checkMostExpensiveCar(int customerMoney) {
        if (customerMoney >= Price.DYNA.getSellPrice()) {
            return Price.DYNA;
        } else if (customerMoney >= Price.HIANCE.getSellPrice()) {
            return Price.HIANCE;
        } else if (customerMoney >= Price.SOLARA.getSellPrice()){
            return Price.SOLARA;
        } else if (customerMoney >= Price.CAMRY.getSellPrice()) {
            return Price.CAMRY;
        }
        return null;
    }

    private void checkAvailableCar(Price price, Warehouse warehouse) {
        if (warehouse.getCarQty() == 0) {
            sendRequestForAssembly(price);
        }

        if (price == Price.DYNA) {

        }
    }

    private void sendRequestForAssembly(Price price) {
        if (price == Price.DYNA) {


        }
    }
}
