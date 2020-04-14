package com.bridgelabz.service;

import com.bridgelabz.model.UnitType;
import com.bridgelabz.model.Units;

public class UnitConverter implements IUnitConverter{

    private double value;
    private UnitType unitType;

    //Parameterized constructor for passing argument value and unit.
    public UnitConverter(double value, Units unit) {
        this.value = Converting(value, unit);
        this.unitType = unit.getUnitType();
    }

    public double getValue() {
        return value;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    //Method to Convert value into particular Unit.
    public double Converting(double value, Units units) {
        switch (units.getUnitType()) {
            case TEMPERATURE:
                return (units == Units.FAHRENHEIT) ? (value - 32) * 5 / 9 : value;
            default:
                return value * units.getUnitValue();
        }
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
