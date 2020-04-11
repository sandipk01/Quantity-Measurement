package com.bridgelabz.service;

public enum Units {

    INCHES(UnitType.LENGTH,1), FEET(UnitType.LENGTH,12),
    YARDS(UnitType.LENGTH, 36),CENTIMETER(UnitType.LENGTH, 0.4);

    private double unitValue;
    private UnitType unitType;

    Units(UnitType unitType,double unitValue) {
        this.unitValue = unitValue;
        this.unitType=unitType;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public double getUnitValue() {
        return unitValue;
    }

}
