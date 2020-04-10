package com.bridgelabz.service;

public enum Units {

    INCHES(1), FEET(12);

    private double unitValue;

    Units(double unitValue) {
        this.unitValue = unitValue;
    }
    
    public double getUnitValue() {
        return unitValue;
    }

}
