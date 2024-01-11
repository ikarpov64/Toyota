package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.employee.Cashier;
import org.javaacadmey.toyota.car.employee.Manager;
import org.javaacadmey.toyota.car.exeptions.NoCarAvailableException;
import org.javaacadmey.toyota.car.factory.AssemblyLine;
import org.javaacadmey.toyota.car.factory.CarAssembler;
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
        CarAssembler carAssembler = new CarAssembler(assemblyLine, warehouse);

        carAssembler.assembleCamry("Black", Price.CAMRY);
        carAssembler.assembleSolara("Black", Price.SOLARA);
        carAssembler.assembleDyna("Black", Price.DYNA);
        carAssembler.assembleHiance("Black", Price.HIANCE);

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

        cashier.addIncome(manager.sellCar(customer1, warehouse, carAssembler));
        cashier.addIncome(manager.sellCar(customer2, warehouse, carAssembler));
        cashier.addIncome(manager.sellCar(customer3, warehouse, carAssembler));
        cashier.addIncome(manager.sellCar(customer4, warehouse, carAssembler));
        cashier.addIncome(manager.sellCar(customer5, warehouse, carAssembler));
        cashier.addIncome(manager.sellCar(customer6, warehouse, carAssembler));
        cashier.addIncome(manager.sellCar(customer7, warehouse, carAssembler));
        cashier.addIncome(manager.sellCar(customer8, warehouse, carAssembler));
        System.out.println("Сумма продаж: " + cashier.getIncomeSum());
        manager.generateReport();
    }
}
