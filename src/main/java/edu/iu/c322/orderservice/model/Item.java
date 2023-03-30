package edu.iu.c322.orderservice.model;

public class Item {
   String name;
   int quantity;
   int price;
   int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


   Item(String name, int price, int quantity){
       this.name = name;
       this.price = price;
       this.quantity = quantity;
   }
}
