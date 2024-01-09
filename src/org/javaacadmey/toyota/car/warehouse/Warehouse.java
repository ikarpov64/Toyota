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
    private Car[] camrys = new Camry[0];
    private Car[] dynas = new Dyna[0];
    private Car[] hiances = new Hiance[0];
    private Car[] solaras = new Solara[0];

    public int getCarQty() {
        return carQty;
    }

    public void addCamry(Camry camry) {
        this.camrys = increaseArray(this.camrys, this.camrys.length + 1);
        this.camrys[this.camrys.length - 1] = camry;
        increaseCarQty();
    }

    public void addDyna(Dyna dynas) {
        this.dynas = increaseArray(this.dynas, this.dynas.length + 1);
        this.dynas[this.dynas.length - 1] = dynas;
        increaseCarQty();
    }

    public void addHiance(Hiance hiance) {
        this.hiances = increaseArray(this.hiances, this.hiances.length + 1);
        this.hiances[this.hiances.length - 1] = hiance;
        increaseCarQty();
    }

    public void addSolara(Solara solara) {
        this.solaras = increaseArray(this.solaras, this.solaras.length + 1);
        this.solaras[this.solaras.length - 1] = solara;
        increaseCarQty();
    }

    private Car[] increaseArray(Car[] cars, int carsCount) {
        return Arrays.copyOf(cars, carsCount);
    }

    public Car getCamry() throws NoCarAvailableException {
        if (getCarsQty(this.camrys) != 0) {
            Car camry = this.camrys[camrysQty() - 1];
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

    public Car getSolara() throws NoCarAvailableException {
        if (getCarsQty(this.solaras) != 0){
            Car solara = this.solaras[solarasQty() - 1];
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

    public Car getDyna() throws NoCarAvailableException {
        if (getCarsQty(this.dynas) != 0) {
            Car dyna = this.dynas[dynasQty() - 1];
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

    public Car getHiance() throws NoCarAvailableException {
        if (getCarsQty(this.hiances) != 0) {
            Car hiance = this.hiances[hiancesQty() - 1];
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

    public Car[] getSolaras() {
        return solaras;
    }
}
