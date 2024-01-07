package org.javaacadmey.toyota.car.cars;

public enum CarColor {
    WHITE("Белый"), BLACK("Черный");
    private String colorName;

    CarColor(String colorName) {
        this.colorName = colorName;
    }

    public String getColorName() {
        return colorName;
    }
}
