package com.bridgelabz.service;

public enum Units {

    INCHES(UnitType.LENGTH,1), FEET(UnitType.LENGTH,12);

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
