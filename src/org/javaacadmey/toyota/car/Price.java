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
}
