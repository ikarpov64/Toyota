package org.javaacadmey.toyota.car;

import org.javaacadmey.toyota.car.cars.components.*;
import org.javaacadmey.toyota.car.cars.models.Solara;
import org.javaacadmey.toyota.car.exeptions.StartCarException;
import org.javaacadmey.toyota.car.cars.models.Camry;
import org.javaacadmey.toyota.car.factory.AssemblyLine;
import org.javaacadmey.toyota.car.factory.Factory;
import org.javaacadmey.toyota.car.warehouse.Warehouse;

public class Runner {
    public static void main(String[] args) throws StartCarException {

        AssemblyLine assemblyLine = new AssemblyLine();

        Camry camry = assemblyLine.createCamry("white", 1000);
        Solara solara = assemblyLine.createSolara("black", 12000);
        Solara solara2 = assemblyLine.createSolara("black", 12000);
        Solara solara3 = assemblyLine.createSolara("black", 12000);

        Warehouse warehouse = new Warehouse();
        System.out.println(warehouse.solarasQty());
        warehouse.addSolara(solara);
        System.out.println(warehouse.solarasQty());
        warehouse.addSolara(solara2);
        System.out.println(warehouse.solarasQty());
        warehouse.addSolara(solara3);
        System.out.println(warehouse.solarasQty());

//        camry.playMusic();
//        camry.changeCruise();
//        camry.turnHeadlights();
//        camry.startMoving();
//        camry.stopMoving();

    }
}
