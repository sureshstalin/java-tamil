package com.itgarden.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Customer {


    private Long customerId;

    private String firstName;

    private String lastName;

    private Address address;
}


