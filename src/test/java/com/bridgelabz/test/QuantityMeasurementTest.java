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
    public void givenFeetObjectNull_WhenCompare_ThenShouldThrowsNullException() {
        UnitConverter converterInch = new UnitConverter(0, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        try {
            result = quantityMeasurement.compare(converterInch, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenSameObject_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterFeet = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterFeet, converterFeet);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenSameTypeObject_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(0, Units.FEET);
        UnitConverter converterFeet = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterInches, converterFeet);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenValue_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(0, Units.FEET);
        UnitConverter converterFeet = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        quantityMeasurement.compare(converterInches, converterFeet);
        result = (converterInches.getValue() == converterFeet.getValue()) ? true : false;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInchObjectNull_WhenCompare_ThenShouldThrowsNullException() {
        UnitConverter converterFoot = new UnitConverter(0, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        try {
            result = quantityMeasurement.compare(converterFoot, null);
        } catch (QuantityMeasurementException e) {
            Assert.assertEquals(QuantityMeasurementException.ExceptionType.NULL_EXCEPTION, e.type);
        }
    }

    @Test
    public void givenInchSameObject_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInch = new UnitConverter(0, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterInch, converterInch);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInchTypeObject_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(0, Units.INCHES);
        UnitConverter converterInches2 = new UnitConverter(0, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterInches, converterInches2);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInchValue_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(0, Units.INCHES);
        UnitConverter converterInches2 = new UnitConverter(0, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        quantityMeasurement.compare(converterInches, converterInches2);
        result = (converterInches.getValue() == converterInches2.getValue()) ? true : false;
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetEqualsYards_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterFeet = new UnitConverter(3, Units.FEET);
        UnitConverter converterYards = new UnitConverter(1, Units.YARDS);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterFeet, converterYards);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeetNotEqualsYards_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterFeet = new UnitConverter(1, Units.FEET);
        UnitConverter converterYards = new UnitConverter(1, Units.YARDS);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterFeet, converterYards);
        Assert.assertNotEquals(true, result);
    }

    @Test
    public void givenInchNotEqualsYards_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInch = new UnitConverter(1, Units.INCHES);
        UnitConverter converterYards = new UnitConverter(1, Units.YARDS);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterInch, converterYards);
        Assert.assertNotEquals(true, result);
    }

    @Test
    public void givenYardAndInches_WhenCompareEquals_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterYards = new UnitConverter(1, Units.YARDS);
        UnitConverter converterInches = new UnitConverter(36, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterYards, converterInches);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInchesAndYard_WhenCompareEquals_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(36, Units.INCHES);
        UnitConverter converterYards = new UnitConverter(1, Units.YARDS);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterInches, converterYards);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenYardAndFeet_WhenCompareEquals_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterYards = new UnitConverter(1, Units.YARDS);
        UnitConverter converterFeet = new UnitConverter(3, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterYards, converterFeet);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInchesAndCentimeters_WhenCompareEquals_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterInches = new UnitConverter(2, Units.INCHES);
        UnitConverter converterCentimeters = new UnitConverter(5, Units.CENTIMETER);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterInches, converterCentimeters);
        Assert.assertEquals(true, result);
    }
}
