package org.javaacadmey.toyota.car.factory;

public enum Countries {
    JAPAN("Япония"),
    KOREA("Корея"),
    RUSSIA("Россия"),
    USA("США");

    private final String name;

    Countries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
