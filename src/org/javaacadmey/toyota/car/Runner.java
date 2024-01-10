package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.components.*;
import org.javaacadmey.toyota.car.cars.models.Dyna;
import org.javaacadmey.toyota.car.cars.models.Hiance;
import org.javaacadmey.toyota.car.cars.models.Solara;
import org.javaacadmey.toyota.car.exeptions.NoCarAvailableException;
import org.javaacadmey.toyota.car.exeptions.StartCarException;
import org.javaacadmey.toyota.car.cars.models.Camry;
import org.javaacadmey.toyota.car.factory.AssemblyLine;
import org.javaacadmey.toyota.car.factory.Factory;
import org.javaacadmey.toyota.car.warehouse.Warehouse;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws StartCarException, NoCarAvailableException {

        Factory[] factories = new Factory[Countries.values().length];
        for (int i = 0; i < Countries.values().length; i++) {
            factories[i] = new Factory(Countries.values()[i]);
        }
//        System.out.println(Arrays.toString(Countries.values()));
        System.out.println(Arrays.toString(factories));
        Factory factory = new Factory(Countries.JAPAN);
        AssemblyLine assemblyLine = new AssemblyLine(Countries.JAPAN, factories);
        Warehouse warehouse = new Warehouse();

        Car camry = assemblyLine.createCamry("black", Price.CAMRY);
        Car solara = assemblyLine.createSolara("white", Price.SOLARA);
        Car hiance = assemblyLine.createHiance("black", Price.HIANCE);
        Car dyna = assemblyLine.createDyna("black", Price.DYNA);

        warehouse.addCamry(camry);
        warehouse.addSolara(solara);
        warehouse.addHiance(hiance);
        warehouse.addDyna(dyna);

        Cashier cashier = new Cashier();
        Manager manager1 = new Manager("Peter");
        Customer customer1 = new Customer("Ivan", 10000);
        Customer customer2 = new Customer("Ivan2", 12000);
        Customer customer3 = new Customer("Ivan3", 15000);
        Customer customer4 = new Customer("Ivan4", 22000);
        Customer customer5 = new Customer("Ivan5", 11000);
        Customer customer6 = new Customer("Ivan6", 13000);
        Customer customer7 = new Customer("Ivan7", 8000);
        Customer customer8 = new Customer("Ivan8", 30000);

        cashier.addIncome(manager1.sellCar(customer1, warehouse, assemblyLine));
        cashier.addIncome(manager1.sellCar(customer2, warehouse, assemblyLine));
        cashier.addIncome(manager1.sellCar(customer3, warehouse, assemblyLine));
        cashier.addIncome(manager1.sellCar(customer4, warehouse, assemblyLine));
        cashier.addIncome(manager1.sellCar(customer5, warehouse, assemblyLine));
        cashier.addIncome(manager1.sellCar(customer6, warehouse, assemblyLine));
        cashier.addIncome(manager1.sellCar(customer7, warehouse, assemblyLine));
        cashier.addIncome(manager1.sellCar(customer8, warehouse, assemblyLine));
        System.out.println(cashier.incomeSum());

//        System.out.println(warehouse.camrysQty());
//        System.out.println(warehouse.solarasQty());
//        warehouse.getSolara();
//        System.out.println(warehouse.solarasQty());
//        System.out.println(warehouse.solarasQty());
//        warehouse.getSolara();
//        System.out.println(warehouse.solarasQty());
//        warehouse.getSolara();
//        System.out.println(warehouse.solarasQty());
//        warehouse.getSolara();
//        System.out.println(warehouse.solarasQty());




//        camry.playMusic();
//        camry.changeCruise();
//        camry.turnHeadlights();
//        camry.startMoving();
//        camry.stopMoving();

    }
}
