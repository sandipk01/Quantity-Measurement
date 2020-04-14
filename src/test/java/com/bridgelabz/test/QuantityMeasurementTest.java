package com.bridgelabz.test;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.service.UnitConverter;
import com.bridgelabz.service.QuantityMeasurement;
import com.bridgelabz.model.Units;
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

    @Test
    public void givenInputInInches_WhenAdding_ThenShouldReturnAdditionOfBoth() throws QuantityMeasurementException {
        UnitConverter converterInches1 = new UnitConverter(2, Units.INCHES);
        UnitConverter converterInches2 = new UnitConverter(2, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        double addition = quantityMeasurement.addingTwoUnitValues(converterInches1, converterInches2);
        Assert.assertEquals(4, addition,0);
    }

    @Test
    public void givenFeetAndInches_WhenAdding_ThenShouldReturnAdditionOfBoth() throws QuantityMeasurementException {
        UnitConverter converterFeet = new UnitConverter(1, Units.FEET);
        UnitConverter converterInches = new UnitConverter(2, Units.INCHES);
        quantityMeasurement = new QuantityMeasurement();
        double addition = quantityMeasurement.addingTwoUnitValues(converterFeet, converterInches);
        Assert.assertEquals(14, addition,0);
    }

    @Test
    public void givenFeet_WhenAdding_ThenShouldReturnAdditionOfBoth() throws QuantityMeasurementException {
        UnitConverter converterFeet1 = new UnitConverter(1, Units.FEET);
        UnitConverter converterFeet2 = new UnitConverter(1, Units.FEET);
        quantityMeasurement = new QuantityMeasurement();
        double addition = quantityMeasurement.addingTwoUnitValues(converterFeet1, converterFeet2);
        Assert.assertEquals(24, addition,0);
    }

    @Test
    public void givenInchAndCentimeter_WhenAdding_ThenShouldReturnAdditionOfBoth() throws QuantityMeasurementException {
        UnitConverter converterInch = new UnitConverter(2, Units.INCHES);
        UnitConverter converterCentimeter = new UnitConverter(2.5, Units.CENTIMETER);
        quantityMeasurement = new QuantityMeasurement();
        double addition = quantityMeasurement.addingTwoUnitValues(converterInch, converterCentimeter);
        Assert.assertEquals(3, addition,0);
    }

    @Test
    public void givenGallonAndLiters_WhenCompareEquals_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterGallon = new UnitConverter(1, Units.GALLON);
        UnitConverter converterLiters = new UnitConverter(3.78, Units.LITRE);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterGallon, converterLiters);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLitersAndMilliliter_WhenCompareEquals_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterLiter = new UnitConverter(1, Units.LITRE);
        UnitConverter converterMilliliters = new UnitConverter(1000, Units.MILLILITRE);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterLiter, converterMilliliters);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenGallonAndLiters_WhenAdding_ThenShouldReturnAdditionOfBoth() throws QuantityMeasurementException {
        UnitConverter converterGallon = new UnitConverter(1, Units.GALLON);
        UnitConverter converterLiter = new UnitConverter(3.78, Units.LITRE);
        quantityMeasurement = new QuantityMeasurement();
        double result = quantityMeasurement.addingTwoUnitValues(converterGallon, converterLiter);
        Assert.assertEquals(7.57, result,0.1);
    }

    @Test
    public void givenLiterAndMilliliters_WhenAdding_ThenShouldReturnAdditionOfBoth() throws QuantityMeasurementException {
        UnitConverter converterLiter = new UnitConverter(1, Units.LITRE);
        UnitConverter converterMilliliters = new UnitConverter(1000, Units.MILLILITRE);
        quantityMeasurement = new QuantityMeasurement();
        double result = quantityMeasurement.addingTwoUnitValues(converterLiter, converterMilliliters);
        Assert.assertEquals(2, result,0);
    }

    @Test
    public void givenKilogramAndGrams_WhenComparing_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterKiloGram = new UnitConverter(1, Units.KILOGRAMS);
        UnitConverter converterGram = new UnitConverter(1000, Units.GRAMS);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterKiloGram, converterGram);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTonneAndKilograms_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterTonne = new UnitConverter(1, Units.TONNE);
        UnitConverter converterKilogram = new UnitConverter(1000, Units.KILOGRAMS);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterTonne, converterKilogram);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenTonneAndGrams_WhenAdding_ThenShouldReturnAdditionOfBoth() throws QuantityMeasurementException {
        UnitConverter converterTonne = new UnitConverter(1, Units.TONNE);
        UnitConverter converterGram = new UnitConverter(1000, Units.GRAMS);
        quantityMeasurement = new QuantityMeasurement();
        double result = quantityMeasurement.addingTwoUnitValues(converterTonne, converterGram);
        Assert.assertEquals(1001, result,0);
    }

    @Test
    public void givenFahrenheitAndCelsius_WhenCompare_ThenShouldReturnTrue() throws QuantityMeasurementException {
        UnitConverter converterFahrenheit = new UnitConverter(212, Units.FAHRENHEIT);
        UnitConverter converterCelsius = new UnitConverter(100, Units.CELSIUS);
        quantityMeasurement = new QuantityMeasurement();
        result = quantityMeasurement.compare(converterFahrenheit, converterCelsius);
        Assert.assertEquals(true, result);
    }


}
