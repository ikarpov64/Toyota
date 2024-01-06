package org.javaacadmey.toyota.car.warehouse;

import org.javaacadmey.toyota.car.cars.models.Camry;
import org.javaacadmey.toyota.car.cars.models.Dyna;
import org.javaacadmey.toyota.car.cars.models.Hiance;
import org.javaacadmey.toyota.car.cars.models.Solara;

public class Warehouse {
    private final int MAX_CARS_QTY = 1000;
    private int carQty = 0;
    Camry[] camries;
    Dyna[] dynas;
    Hiance[] hiances;
    Solara[] solaras = new Solara[0];

    public void addCamry(Camry camry) {
        Camry[] newCamries = new Camry[this.camries.length + 1];
        for (int i = 0; i < this.camries.length; i++) {
            newCamries[i] = this.camries[i];
        }
        newCamries[newCamries.length - 1] = camry;
        this.carQty++;
    }

    public void addDyna(Dyna dynas) {
        Dyna[] newDynas = new Dyna[this.dynas.length + 1];
        for (int i = 0; i < this.dynas.length; i++) {
            newDynas[i] = this.dynas[i];
        }
        newDynas[newDynas.length - 1] = dynas;
        this.carQty++;
    }

    public void addHiance(Hiance hiance) {
        Hiance[] newHiances = new Hiance[this.hiances.length + 1];
        for (int i = 0; i < this.hiances.length; i++) {
            newHiances[i] = this.hiances[i];
        }
        newHiances[newHiances.length - 1] = hiance;
        this.carQty++;
    }

    public void addSolara(Solara solara) {
        Solara[] newSolara = new Solara[this.solaras.length + 1];
        System.arraycopy(this.solaras, 0, newSolara, 0, this.solaras.length);
        newSolara[newSolara.length - 1] = solara;
        this.solaras = newSolara;
        this.carQty++;
    }

    public int camrysQty() {
        return this.camries.length;
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
