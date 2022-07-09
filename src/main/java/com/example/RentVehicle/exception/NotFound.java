package com.example.RentVehicle.exception;

public class NotFound extends RuntimeException {

    public NotFound(Long id) {
        super("Could not find " + id);
    }
}