package com.bridgelabz.service;

public class QuantityMeasurement {

    //Method for comparing two objects.
    public boolean compare(UnitConverter unitConverter, UnitConverter unitConverter2) {
        return (unitConverter.equals(unitConverter2)) ? true : false;
    }
}
