package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.employee.Cashier;
import org.javaacadmey.toyota.car.employee.Manager;
import org.javaacadmey.toyota.car.exeptions.NoCarAvailableException;
import org.javaacadmey.toyota.car.factory.AssemblyLine;
import org.javaacadmey.toyota.car.factory.Factory;
import org.javaacadmey.toyota.car.factory.Countries;
import org.javaacadmey.toyota.car.cars.Price;
import org.javaacadmey.toyota.car.warehouse.Warehouse;

public class Runner {
    public static void main(String[] args) throws NoCarAvailableException {

        Factory[] factories = new Factory[Countries.values().length];
        for (int i = 0; i < Countries.values().length; i++) {
            factories[i] = new Factory(Countries.values()[i]);
        }
        AssemblyLine assemblyLine = new AssemblyLine(Countries.JAPAN, factories);
        Warehouse warehouse = new Warehouse();

        warehouse.addCamry(assemblyLine.createCamry("black", Price.CAMRY));
        warehouse.addSolara(assemblyLine.createSolara("white", Price.SOLARA));
        warehouse.addHiance(assemblyLine.createHiance("black", Price.HIANCE));
        warehouse.addDyna(assemblyLine.createDyna("black", Price.DYNA));

        Cashier cashier = new Cashier();
        Manager manager = new Manager("Peter");
        Customer customer1 = new Customer("Ivan", 10000);
        Customer customer2 = new Customer("Ivan2", 12000);
        Customer customer3 = new Customer("Ivan3", 15000);
        Customer customer4 = new Customer("Ivan4", 22000);
        Customer customer5 = new Customer("Ivan5", 11000);
        Customer customer6 = new Customer("Ivan6", 13000);
        Customer customer7 = new Customer("Ivan7", 8000);
        Customer customer8 = new Customer("Ivan8", 30000);

        cashier.addIncome(manager.sellCar(customer1, warehouse, assemblyLine));
        cashier.addIncome(manager.sellCar(customer2, warehouse, assemblyLine));
        cashier.addIncome(manager.sellCar(customer3, warehouse, assemblyLine));
        cashier.addIncome(manager.sellCar(customer4, warehouse, assemblyLine));
        cashier.addIncome(manager.sellCar(customer5, warehouse, assemblyLine));
        cashier.addIncome(manager.sellCar(customer6, warehouse, assemblyLine));
        cashier.addIncome(manager.sellCar(customer7, warehouse, assemblyLine));
        cashier.addIncome(manager.sellCar(customer8, warehouse, assemblyLine));
        System.out.println(cashier.incomeSum());
        manager.generateReport();
    }
}
