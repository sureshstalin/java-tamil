package com.itgarden.controller;

import com.itgarden.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {


    List<Customer> customerList = new ArrayList<>();
    long customerId;

    @PostMapping("/customers") // http://localhost:9090/customers
    public Customer save(@RequestBody Customer customer) {

            customer.setCustomerId(++customerId);
            customerList.add(customer);
            return customer;
    }

    @GetMapping("/customers") // http://localhost:9090/customers
    public List<Customer> getAllCustomers() {
        return customerList;
    }




    // Create Rest API

    // Read Rest API

    // Update Rest API

    // Delete Rest API
}
