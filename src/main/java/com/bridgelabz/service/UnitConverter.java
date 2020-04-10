package com.bridgelabz.service;

public class UnitConverter {

    private double value;
    private UnitType unitType;

    //Parameterized constructor for passing argument value and unit.
    public UnitConverter(double value, Units unit) {
        this.value=Converting(value,unit);
        this.unitType=unit.getUnitType();
    }

    public double getValue() {
        return value;
    }

    public UnitType getUnitType() {
        return unitType;
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
