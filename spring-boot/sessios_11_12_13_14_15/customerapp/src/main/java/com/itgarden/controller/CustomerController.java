package com.itgarden.controller;

import com.itgarden.model.Customer;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {


    List<Customer> customerList = new ArrayList<>();
    long customerId;

    @PostMapping("/customers") // http://localhost:9090/customers/20 - endpoint
    public ResponseEntity<Customer> save(@RequestBody Customer customer) {

        customer.setCustomerId(++customerId);
        customerList.add(customer);
        ResponseEntity<Customer> responseEntity = new ResponseEntity<>(customer, HttpStatus.CREATED);
        return responseEntity;
    }

    @GetMapping("/customers") // http://localhost:9090/customers
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    @GetMapping("/customers/{customerId}") // http://localhost:9090/customers
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") long customerId) {
        Customer currentCustomer = customerList.stream().filter(customer -> customer.getCustomerId() == customerId).findAny().get();
        return new ResponseEntity<>(currentCustomer, HttpStatus.OK);
    }

    @PutMapping("/customers/{customerId}") // http://localhost:9090/customers/3
    public ResponseEntity<Customer> updateCustomerById(@PathVariable("customerId") long customerId, @RequestBody Customer customer) {
        customer.setCustomerId(customerId);
        Customer currentCustomer = customerList.stream().filter(c -> c.getCustomerId() == customerId).findAny().get();
        BeanUtils.copyProperties(customer, currentCustomer);
        return new ResponseEntity<>(currentCustomer, HttpStatus.OK);
    }

    @DeleteMapping("/customers/{customerId}") // http://localhost:9090/customers/3
    public ResponseEntity<Customer> deleteCustomerById(@PathVariable("customerId") long customerId) {
        Customer currentCustomer = customerList.stream().filter(c -> c.getCustomerId() == customerId).findAny().get();
        customerList.remove(currentCustomer);
        return new ResponseEntity<>(currentCustomer, HttpStatus.OK);
    }

    // Create Rest API

    // Read Rest API

    // Update Rest API

    // Delete Rest API
}
