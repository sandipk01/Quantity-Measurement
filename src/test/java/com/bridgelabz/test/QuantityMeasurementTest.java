package com.bridgelabz.test;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.service.UnitConverter;
import com.bridgelabz.service.QuantityMeasurement;
import com.bridgelabz.service.Units;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    private QuantityMeasurement quantityMeasurement;
    private boolean result;

    @Test
    public void givenFeetAndInches_WhenCompareFeetToInches_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(1, Units.FEET);
        UnitConverter converterFeet = new UnitConverter(12, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterInches, converterFeet);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetAndFeetZero_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(0, Units.FEET);
        UnitConverter converterFeet = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterInches, converterFeet);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetObjectNull_WhenCompare_ThenShouldThrowsNullException(){
        UnitConverter converterFeet = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        try {
            result = quantityMeasurement.compare(converterFeet, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION,e.type);
        }
    }

    @Test
    public void givenSameObject_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterFeet = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterFeet, converterFeet);
        Assert.assertEquals(true, result);
    }

}
