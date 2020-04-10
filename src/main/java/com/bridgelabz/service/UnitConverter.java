package com.bridgelabz.service;

public class UnitConverter {

    private double value;

    //Parameterized constructor for passing argument value and unit.
    public UnitConverter(double value, Units unit) {
        this.value=Converting(value,unit);
    }

    //Method to Convert value into particular Unit.
    private double Converting(double value,Units units){
        return value*units.getUnitValue();
    }

    //Overridden equals method.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitConverter quantity = (UnitConverter) o;
        return Double.compare(quantity.value, value) == 0;
    }

}
