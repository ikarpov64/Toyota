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

public class Runner {
    public static void main(String[] args) throws StartCarException, NoCarAvailableException {

        Factory factory = new Factory(Countries.JAPAN);
        AssemblyLine assemblyLine = new AssemblyLine(Countries.JAPAN);
        Warehouse warehouse = new Warehouse();


        Camry camry = assemblyLine.createCamry("black", 10000);
        Solara solara = assemblyLine.createSolara("white", 12000);
        Hiance hiance = assemblyLine.createHiance("black", 15000);
        Dyna dyna = assemblyLine.createDyna("black", 22000);
        Solara solara1 = assemblyLine.createSolara("white", 12000);
        Solara solara2 = assemblyLine.createSolara("white", 12000);

        warehouse.addCamry(camry);
        warehouse.addSolara(solara);
        warehouse.addHiance(hiance);
        warehouse.addDyna(dyna);
        warehouse.addSolara(solara1);
        warehouse.addSolara(solara2);

        Manager manager1 = new Manager();
        Customer customer1 = new Customer("Ivan", 30000);
        manager1.sellCar(customer1, warehouse);

        System.out.println(warehouse.solarasQty());
        warehouse.getSolara();
        System.out.println(warehouse.solarasQty());
        warehouse.getSolara();
        System.out.println(warehouse.solarasQty());
        warehouse.getSolara();
        System.out.println(warehouse.solarasQty());
        warehouse.getSolara();
        System.out.println(warehouse.solarasQty());




//        camry.playMusic();
//        camry.changeCruise();
//        camry.turnHeadlights();
//        camry.startMoving();
//        camry.stopMoving();

    }
}
