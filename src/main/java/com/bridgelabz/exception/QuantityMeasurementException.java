package com.bridgelabz.service;

public class QuantityMeasurementException extends Throwable {

    public enum ExceptionType {
        NULL_EXCEPTION;
    }

    ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
