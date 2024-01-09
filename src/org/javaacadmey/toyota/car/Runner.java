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

        Factory factory = new Factory(Countries.JAPAN);
        AssemblyLine assemblyLine = new AssemblyLine(Countries.JAPAN);
        Warehouse warehouse = new Warehouse();


        Car camry = assemblyLine.createCamry("black", Price.CAMRY.getSellPrice());
//        Car solara = assemblyLine.createSolara("white", Price.SOLARA.getSellPrice());
        Car hiance = assemblyLine.createHiance("black", Price.HIANCE.getSellPrice());
        Car dyna = assemblyLine.createDyna("black", Price.DYNA.getSellPrice());
//        Car solara1 = assemblyLine.createSolara("white", Price.SOLARA.getSellPrice());
//        Car solara2 = assemblyLine.createSolara("white", Price.SOLARA.getSellPrice());
//        Car solara4 = assemblyLine.createSolara("white", Price.SOLARA.getSellPrice());
//        Car solara5 = assemblyLine.createSolara("white", Price.SOLARA.getSellPrice());
//        Car solara6 = assemblyLine.createSolara("white", Price.SOLARA.getSellPrice());
//        Car solara7 = assemblyLine.createSolara("white", Price.SOLARA.getSellPrice());

        warehouse.addCamry(camry);
//        warehouse.addSolara(solara);
        warehouse.addHiance(hiance);
        warehouse.addDyna(dyna);
//        warehouse.addSolara(solara1);
//        warehouse.addSolara(solara2);
//        warehouse.addSolara(solara4);
//        warehouse.addSolara(solara5);
//        warehouse.addSolara(solara6);
//        warehouse.addSolara(solara7);
//        System.out.println(warehouse.solarasQty());
//        System.out.println(Arrays.toString(warehouse.getSolaras()));

        Manager manager1 = new Manager();
        Customer customer1 = new Customer("Ivan", 9000);
        manager1.sellCar(customer1, warehouse, assemblyLine);

        System.out.println(warehouse.solarasQty());
//        warehouse.getSolara();
        System.out.println(warehouse.solarasQty());
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
