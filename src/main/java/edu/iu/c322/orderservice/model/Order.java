package edu.iu.c322.orderservice.model;
import java.util.List;


import java.util.Objects;

import jakarta.validation.constraints.NotEmpty;
import java.util.ArrayList;

public class Order {
    private int customerId;
    private int total;
    Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    Address shippingAddress;

    List<Return> returns = new ArrayList<>();
    public List<Return> getReturns() {
        return returns;
    }

    public void setReturns(List<Return> returns) {
        this.returns = returns;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    List<Item> items = new ArrayList<Item>();


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getCustomerId() {
        return customerId;
    }



    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Order)) {
            return false;
        }
        Order order = (Order) o;
        return customerId == order.customerId && Objects.equals(total, order.total) && Objects.equals(customerId, order.total);
    }
}