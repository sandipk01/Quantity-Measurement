package com.bridgelabz.test;

import com.bridgelabz.service.UnitConverter;
import com.bridgelabz.service.QuantityMeasurement;
import com.bridgelabz.service.Units;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    private QuantityMeasurement quantityMeasurement;

    @Test
    public void givenFeetAndInches_WhenCompareFeetToInches_ThenShouldReturnTrue() {
        UnitConverter converterInches = new UnitConverter(1, Units.FEET);
        UnitConverter converterFeet = new UnitConverter(12, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        boolean inchAndFeet = quantityMeasurement.compare(converterInches, converterFeet);
        Assert.assertEquals(true, inchAndFeet);
    }

    @Test
    public void givenFeetAndFeetZero_WhenCompare_ThenShouldReturnTrue() {
        UnitConverter converterInches = new UnitConverter(0, Units.FEET);
        UnitConverter converterFeet = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        boolean inchAndFeet = quantityMeasurement.compare(converterInches, converterFeet);
        Assert.assertEquals(true, inchAndFeet);
    }
}
