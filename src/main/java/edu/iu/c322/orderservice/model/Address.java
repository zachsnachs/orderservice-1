package edu.iu.c322.orderservice.model;

import jakarta.persistence.Entity;
import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Address {
    private String State, City;
    private int postalCode;

    @Entity

    public Address(String state, String city, int postalCode) {
        State = state;
        City = city;
        this.postalCode = postalCode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}
