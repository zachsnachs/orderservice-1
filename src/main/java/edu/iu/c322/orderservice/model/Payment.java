package edu.iu.c322.orderservice.model;

public class Payment {
    private String method, number;

    private Address billingAddress;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }



    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

}
