package org.javaacadmey.toyota.car;

public enum Price {
    CAMRY(10000, 5000),
    SOLARA(12000, 8000),
    HIANCE(15000, 10000),
    DYNA(22000, 12000);

    private int sellPrice;
    private int costPrice;

    Price(int sellPrice, int costPrice) {
        this.sellPrice = sellPrice;
        this.costPrice = costPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public static Price getMaxCarBySellPrice(int maxBudget) {
        Price[] values = values();
        Price maxCar = null;

        for (Price car : values) {
            if (car.getSellPrice() <= maxBudget &&
                    (maxCar == null || car.getSellPrice() > maxCar.getSellPrice())) {
                maxCar = car;
            }
        }
        return maxCar;
    }
}
