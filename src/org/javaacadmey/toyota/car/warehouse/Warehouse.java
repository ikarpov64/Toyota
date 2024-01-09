package org.javaacadmey.toyota.car.warehouse;

import org.javaacadmey.toyota.car.cars.Car;
import org.javaacadmey.toyota.car.cars.models.Camry;
import org.javaacadmey.toyota.car.cars.models.Dyna;
import org.javaacadmey.toyota.car.cars.models.Hiance;
import org.javaacadmey.toyota.car.cars.models.Solara;
import org.javaacadmey.toyota.car.exeptions.NoCarAvailableException;

import java.util.Arrays;

public class Warehouse {
    private int freeSpace = 1000;
    private int carQty = 0;
    private Camry[] camrys = new Camry[0];
    private Dyna[] dynas = new Dyna[0];
    private Hiance[] hiances = new Hiance[0];
    private Solara[] solaras = new Solara[0];

    public int getCarQty() {
        return carQty;
    }

    public void addCamry(Camry camry) {
        Camry[] newCamrys = new Camry[this.camrys.length + 1];
        System.arraycopy(this.camrys, 0, newCamrys, 0, this.camrys.length);
        newCamrys[newCamrys.length - 1] = camry;
        this.camrys = newCamrys;
        increaseCarQty();
    }

    public void addDyna(Dyna dynas) {
        Dyna[] newDynas = new Dyna[this.dynas.length + 1];
        System.arraycopy(this.dynas, 0, newDynas, 0, this.dynas.length);
        newDynas[newDynas.length - 1] = dynas;
        this.dynas = newDynas;
        increaseCarQty();
    }

    public void addHiance(Hiance hiance) {
        Hiance[] newHiances = new Hiance[this.hiances.length + 1];
        System.arraycopy(this.hiances, 0, newHiances, 0, this.hiances.length);
        newHiances[newHiances.length - 1] = hiance;
        this.hiances = newHiances;
        increaseCarQty();
    }

    public void addSolara(Solara solara) {
//        Solara[] newSolara = (Solara[]) addCars(this.solaras, this.solaras.length + 1);
//        Car[] newSolara1 = addCars(this.solaras, this.solaras.length + 1);
        this.solaras = addCars(this.solaras, this.solaras.length + 1);
//        Solara[] newSolara = new Solara[this.solaras.length + 1];
//        System.arraycopy(this.solaras, 0, newSolara, 0, this.solaras.length);
        newSolara1[newSolara1.length - 1] = solara;
        this.solaras = newSolara1;
        increaseCarQty();
    }

    private Car[] addCars(Car[] cars, int carsCount) {
        return Arrays.copyOf(cars, carsCount);
    }

    public Camry getCamry() throws NoCarAvailableException {
        if (getCarsQty(this.camrys) != 0) {
            Camry camry = this.camrys[camrysQty() - 1];
            removeCamry(camrysQty() - 1);
            return camry;
        } else {
            throw new NoCarAvailableException("Нет Camry на складе.");
        }
    }

    private void removeCamry(int carIndex) {
        Camry[] newCamry = new Camry[carIndex];
        System.arraycopy(this.camrys, 0, newCamry, 0, carIndex);
        this.camrys = newCamry;
        reduceCarQty();
    }

    public Solara getSolara() throws NoCarAvailableException {
        if (getCarsQty(this.solaras) != 0){
            Solara solara = this.solaras[solarasQty() - 1];
            removeSolara(solarasQty() - 1);
            return solara;
        } else {
            throw new NoCarAvailableException("Нет Solara на складе.");
        }
    }

    private void removeSolara(int carIndex) {
        Solara[] newSolaras = new Solara[carIndex];
        System.arraycopy(this.solaras, 0, newSolaras, 0, carIndex);
        this.solaras = newSolaras;
        reduceCarQty();
    }

    public Dyna getDyna() throws NoCarAvailableException {
        if (getCarsQty(this.dynas) != 0) {
            Dyna dyna = this.dynas[dynasQty() - 1];
            removeDyna(dynasQty() - 1);
            return dyna;
        } else {
            throw new NoCarAvailableException("Нет Dyna на складе.");
        }
    }

    private void removeDyna(int carIndex) {
        Dyna[] newDynas = new Dyna[carIndex];
        System.arraycopy(this.dynas, 0, newDynas, 0, carIndex);
        this.dynas = newDynas;
        reduceCarQty();
    }

    public Hiance getHiance() throws NoCarAvailableException {
        if (getCarsQty(this.hiances) != 0) {
            Hiance hiance = this.hiances[hiancesQty() - 1];
            removeHiance(hiancesQty() - 1);
            return hiance;
        } else {
            throw new NoCarAvailableException("Нет Hiance на складе.");
        }
    }

    private void removeHiance(int carIndex) {
        Hiance[] newHiances = new Hiance[carIndex];
        System.arraycopy(this.hiances, 0, newHiances, 0, carIndex);
        this.hiances = newHiances;
        reduceCarQty();
    }

    private void reduceCarQty() {
        this.carQty--;
        this.freeSpace++;
    }

    private void increaseCarQty() {
        this.carQty++;
        this.freeSpace--;
    }

    private int getCarsQty(Car[] cars){
        return cars.length;
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

    public Solara[] getSolaras() {
        return solaras;
    }
}
