package com.bridgelabz.service;

import com.bridgelabz.exception.QuantityMeasurementException;

public class QuantityMeasurement {

    //Method for comparing two objects.
    public boolean compare(UnitConverter unitConverter, UnitConverter unitConverter2) throws QuantityMeasurementException {
        if (unitConverter == null || unitConverter2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION, "Null Object");
        return (unitConverter.equals(unitConverter2)) ? true : false;
    }
}
