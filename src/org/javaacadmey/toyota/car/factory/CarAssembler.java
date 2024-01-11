package org.javaacadmey.toyota.car.factory;

import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.CarColor;
import org.javaacadmey.toyota.car.cars.Price;
import org.javaacadmey.toyota.car.exeptions.AssemblyRequestException;
import org.javaacadmey.toyota.car.exeptions.CountryFactoryNotEqualException;
import org.javaacadmey.toyota.car.warehouse.Warehouse;

public class CarAssembler extends AssemblyLine{

    AssemblyLine assemblyLine;
    Warehouse warehouse;

    public CarAssembler(AssemblyLine assemblyLine, Warehouse warehouse) {
        super(assemblyLine.getCountry(), assemblyLine.getFactories());
        this.assemblyLine = assemblyLine;
        this.warehouse = warehouse;
    }

    public void assembleCamry(String color, Price price) {
        try {
            Car camry = assemblyLine.createCamry(color, price);
            warehouse.addCamry(camry);
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }

    public void assembleSolara(String color, Price price) {
        try {
            Car solara = assemblyLine.createSolara(color, price);
            warehouse.addSolara(solara);
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }

    public void assembleDyna(String color, Price price) {
        try {
            Car dyna = assemblyLine.createDyna(color, price);
            warehouse.addDyna(dyna);
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }

    public void assembleHiance(String color, Price price) {
        try {
            Car hiance = assemblyLine.createHiance(color, price);
            warehouse.addHiance(hiance);
        } catch (CountryFactoryNotEqualException e) {
            System.out.println(e.getMessage());
        }
    }

    public void executeAssemblyRequest(Price price) throws AssemblyRequestException {
        boolean assembleChecked = false;
        if (price == Price.CAMRY) {
           assembleCamry(CarColor.BLACK.getColorName(), price);
            assembleChecked = checkAssemble(warehouse.camrysQty());
        } else if (price == Price.SOLARA) {
            assembleSolara(CarColor.BLACK.getColorName(), price);
            assembleChecked = checkAssemble(warehouse.solarasQty());
        } else if (price == Price.DYNA) {
            assembleDyna(CarColor.BLACK.getColorName(), price);
            assembleChecked = checkAssemble(warehouse.dynasQty());
        } else if (price == Price.HIANCE) {
            assembleHiance(CarColor.BLACK.getColorName(), price);
            assembleChecked = checkAssemble(warehouse.hiancesQty());
        }
        if (!assembleChecked) {
            throw new AssemblyRequestException("Невозможно выполнить запрос на сборку авто.");
        }
    }

    private boolean checkAssemble(int carQty) {
        return carQty > 0;
    }
}
