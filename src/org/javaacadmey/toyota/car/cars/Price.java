package org.javaacadmey.toyota.car.cars;

public enum Price {
    CAMRY("CAMRY",10000, 5000),
    SOLARA("SOLARA", 12000, 8000),
    HIANCE("HIANCE", 15000, 10000),
    DYNA("DYNA", 22000, 12000);

    private final String model;
    private final double sellPrice;
    private final int costPrice;

    Price(String model, int sellPrice, int costPrice) {
        this.model = model;
        this.sellPrice = sellPrice;
        this.costPrice = costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public String getModel() {
        return model;
    }

    public static Price getMaxCarBySellPrice(double maxBudget) {
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
