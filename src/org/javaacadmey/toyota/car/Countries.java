package org.javaacadmey.toyota.car;

public enum Countries {
    JAPAN("Япония"),
    KOREA("Корея"),
    RUSSIA("Россия"),
    USA("США");

    private String name;

    Countries(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
