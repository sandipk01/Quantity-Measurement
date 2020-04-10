package com.bridgelabz.test;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.service.UnitConverter;
import com.bridgelabz.service.QuantityMeasurement;
import com.bridgelabz.service.Units;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    private QuantityMeasurement quantityMeasurement;

    @Test
    public void givenFeetAndInches_WhenCompareFeetToInches_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(1, Units.FEET);
        UnitConverter converterFeet = new UnitConverter(12, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        boolean inchAndFeet = quantityMeasurement.compare(converterInches, converterFeet);
        Assert.assertEquals(true, inchAndFeet);
    }

    @Test
    public void givenFeetAndFeetZero_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(0, Units.FEET);
        UnitConverter converterFeet = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        boolean inchAndFeet = quantityMeasurement.compare(converterInches, converterFeet);
        Assert.assertEquals(true, inchAndFeet);
    }

    @Test
    public void givenFeetObjectNull_WhenCompare_ThenShouldThrowsNullException(){
        UnitConverter converterInches = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        try {
            boolean inchAndFeet = quantityMeasurement.compare(converterInches, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION,e.type);
        }
    }

}
