package com.bridgelabz.service;

public class Quantity {

    private double value;

    //Parameterized constructor for passing argument value and unit.
    public Quantity(double value, Units unit) {
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
        Quantity quantity = (Quantity) o;
        return Double.compare(quantity.value, value) == 0;
    }

}
