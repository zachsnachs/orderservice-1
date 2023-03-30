package edu.iu.c322.orderservice.model;
import java.util.List;

import java.util.Objects;

import jakarta.validation.constraints.NotEmpty;
import java.util.ArrayList;

public class Order {
    private int customerId, total;
    ArrayList<Item> items = new ArrayList<Item>();


    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
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