package com.bridgelabz.exception;

public class QuantityMeasurementException extends Exception {

    public enum ExceptionType {
        NULL_EXCEPTION,WRONG_TYPE,Invalid_Addition;
    }

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
