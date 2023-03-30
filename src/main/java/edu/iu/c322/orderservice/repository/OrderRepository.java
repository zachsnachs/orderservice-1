package edu.iu.c322.orderservice.repository;


import java.util.ArrayList;
import java.util.List;

import edu.iu.c322.orderservice.model.Item;
import edu.iu.c322.orderservice.model.Order;
import edu.iu.c322.orderservice.model.Return;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class OrderRepository {
    List<Order> orders = new ArrayList<>();

    public List<Order> findAll(){
        return orders;
    }

    public int create(@RequestBody Order order){
        int id = orders.size() + 1;
        orders.add(order);
        return id;
    }
    private Order getById(int id) {
        Order c = orders.stream().filter(x -> x.getId() == id).findAny().orElse(null);
        return c;
    }
    public void update(Return returnRequest){
        Order x = getOrderById(returnRequest.getOrderId());
        if(x != null){
            Item item = getOrderItemById(x, returnRequest.getItemId());
            if(item != null){
                List<Return> returns = x.getReturns();
                returns.add(returnRequest);
                x.setReturns(returns);
            }

        } else {
            throw new IllegalStateException("customer with this id was not found.");
        }
    }

    private Order getOrderById(int orderId){
       Order c = orders.stream().filter(x -> x.getCustomerId() == orderId).findAny().orElse(null);
        return c;
    }

    private Item getOrderItemById(Order order, int itemId){
        Item c = order.getItems().stream().filter(x -> x.getId() == itemId).findAny().orElse(null);
        return c;
    }

    public void delete(int id) {
        Order c = getOrderById(id);
        if(c != null){
            orders.remove(c);
        } else {
            throw new IllegalStateException("customer with this id was not found.");
        }
    }
}
