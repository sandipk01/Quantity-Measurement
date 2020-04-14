package com.bridgelabz.service;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.model.UnitType;

public class QuantityMeasurement {

    //Method for comparing two objects.
    public boolean compare(UnitConverter unitConverter, UnitConverter unitConverter2) throws QuantityMeasurementException {
        if (unitConverter == null || unitConverter2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION, "Null Object");
        if (unitConverter.getUnitType() != unitConverter2.getUnitType())
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.WRONG_TYPE, "Wrong Type");
        return (unitConverter.equals(unitConverter2)) ? true : false;
    }

    //Method for addition of two object values.
    public double addingTwoUnitValues(UnitConverter unitConverter1, UnitConverter unitConverter2) throws QuantityMeasurementException {
        if (unitConverter1 == null || unitConverter2 == null)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION, "Null Object");
        if (unitConverter1.getUnitType() != unitConverter2.getUnitType())
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.WRONG_TYPE, "Wrong Type");
        if (unitConverter1.getUnitType() == UnitType.TEMPERATURE)
            throw new QuantityMeasurementException(QuantityMeasurementException.ExceptionType.Invalid_Addition, "Temperature addition is not possible");
        return unitConverter1.getValue() + unitConverter2.getValue();
    }
}
