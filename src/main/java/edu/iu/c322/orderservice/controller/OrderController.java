package edu.iu.c322.orderservice.controller;

import java.util.List;

import edu.iu.c322.orderservice.model.Order;
import edu.iu.c322.orderservice.model.Return;
import edu.iu.c322.orderservice.repository.OrderRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderRepository repository;

    public OrderController(OrderRepository repository) {
        this.repository = repository;
    }

    // Get https:localhost:8080/customers
    @GetMapping
    public List<Order> findAll() {
        return repository.findAll();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public int create(@Valid @RequestBody Order order) {
        return repository.create(order);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/orders/return")
    public void update(@Valid @RequestBody Return returnRequest) {
        repository.update(returnRequest);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{customerId}")
    public void delete(@PathVariable int customerId) {
        repository.delete(customerId);
    }
}
