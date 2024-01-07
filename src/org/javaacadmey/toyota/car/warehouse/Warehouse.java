package org.javaacadmey.toyota.car.warehouse;

import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.models.Camry;
import org.javaacadmey.toyota.car.cars.models.Dyna;
import org.javaacadmey.toyota.car.cars.models.Hiance;
import org.javaacadmey.toyota.car.cars.models.Solara;

public class Warehouse {
    private int freeSpace = 1000;
    private int carQty = 0;
    Camry[] camrys = new Camry[0];
    Dyna[] dynas = new Dyna[0];
    Hiance[] hiances = new Hiance[0];
    Solara[] solaras = new Solara[0];

    public void addCamry(Camry camry) {
        Camry[] newCamrys = new Camry[this.camrys.length + 1];
        System.arraycopy(this.camrys, 0, newCamrys, 0, this.camrys.length);
        newCamrys[newCamrys.length - 1] = camry;
        this.camrys = newCamrys;
        this.carQty++;
        this.freeSpace--;
    }

    public void addDyna(Dyna dynas) {
        Dyna[] newDynas = new Dyna[this.dynas.length + 1];
        System.arraycopy(this.dynas, 0, newDynas, 0, this.dynas.length);
        newDynas[newDynas.length - 1] = dynas;
        this.dynas = newDynas;
        this.carQty++;
        this.freeSpace--;
    }

    public void addHiance(Hiance hiance) {
        Hiance[] newHiances = new Hiance[this.hiances.length + 1];
        System.arraycopy(this.hiances, 0, newHiances, 0, this.hiances.length);
        newHiances[newHiances.length - 1] = hiance;
        this.hiances = newHiances;
        this.carQty++;
        this.freeSpace--;
    }

    public void addSolara(Solara solara) {
        Solara[] newSolara = new Solara[this.solaras.length + 1];
        System.arraycopy(this.solaras, 0, newSolara, 0, this.solaras.length);
        newSolara[newSolara.length - 1] = solara;
        this.solaras = newSolara;
        this.carQty++;
        this.freeSpace--;
    }

//    public Car getCar() {
//
//        return car;
//    }

    public void removeSolara(Solara solara) {
        int indexToRemove = findIndexOfCar(this.solaras, solara);

        if (indexToRemove != -1) {
            Solara[] newArray = new Solara[this.solaras.length - 1];
            System.arraycopy(this.solaras, 0, newArray, 0, indexToRemove);
            System.arraycopy(this.solaras, indexToRemove + 1,
                    newArray, indexToRemove, this.solaras.length - indexToRemove - 1);
            this.solaras = newArray;
        } else {
            System.out.println("Машины нет на складе");
        }
    }

    public void removeCamry(Camry camry) {
        int indexToRemove = findIndexOfCar(this.camrys, camry);

        if (indexToRemove != -1) {
            Camry[] newArray = new Camry[this.camrys.length - 1];
            System.arraycopy(this.camrys, 0, newArray, 0, indexToRemove);
            System.arraycopy(this.camrys, indexToRemove + 1,
                    newArray, indexToRemove, this.camrys.length - indexToRemove - 1);
            this.camrys = newArray;
        } else {
            System.out.println("Машины нет на складе");
        }
    }

    public void removeDyna(Dyna dyna) {
        int indexToRemove = findIndexOfCar(this.dynas, dyna);

        if (indexToRemove != -1) {
            Dyna[] newArray = new Dyna[this.dynas.length - 1];
            System.arraycopy(this.dynas, 0, newArray, 0, indexToRemove);
            System.arraycopy(this.dynas, indexToRemove + 1,
                    newArray, indexToRemove, this.dynas.length - indexToRemove - 1);
            this.dynas = newArray;
        } else {
            System.out.println("Машины нет на складе");
        }
    }

    public void removeHiance(Hiance hiance) {
        int indexToRemove = findIndexOfCar(this.hiances, hiance);

        if (indexToRemove != -1) {
            Hiance[] newArray = new Hiance[this.hiances.length - 1];
            System.arraycopy(this.hiances, 0, newArray, 0, indexToRemove);
            System.arraycopy(this.hiances, indexToRemove + 1,
                    newArray, indexToRemove, this.hiances.length - indexToRemove - 1);
            this.hiances = newArray;
        } else {
            System.out.println("Машины нет на складе");
        }
    }


    private static int findIndexOfCar(Car[] cars, Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(car)) {
                return i;
            }
        }
        return -1;
    }
    
    public int camrysQty() {
        return this.camrys.length;
    }
    public int dynasQty() {
        return this.dynas.length;
    }
    public int hiancesQty() {
        return this.hiances.length;
    }
    public int solarasQty() {
        return this.solaras.length;
    }

}
