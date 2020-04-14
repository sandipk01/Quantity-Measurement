package com.bridgelabz.model;

public enum Units {

    INCHES(UnitType.LENGTH, 1), FEET(UnitType.LENGTH, 12),
    YARDS(UnitType.LENGTH, 36), CENTIMETER(UnitType.LENGTH, 0.4),
    LITRE(UnitType.VOLUME, 1), GALLON(UnitType.VOLUME, 3.78),
    MILLILITRE(UnitType.VOLUME, 0.001), KILOGRAMS(UnitType.WEIGHT, 1),
    GRAMS(UnitType.WEIGHT, 0.001), TONNE(UnitType.WEIGHT, 1000),
    FAHRENHEIT(UnitType.TEMPERATURE, 1), CELSIUS(UnitType.TEMPERATURE, 1);

    private double unitValue;
    private UnitType unitType;

    Units(UnitType unitType, double unitValue) {
        this.unitValue = unitValue;
        this.unitType = unitType;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public double getUnitValue() {
        return unitValue;
    }

}
