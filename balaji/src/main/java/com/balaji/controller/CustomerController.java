package com.balaji.controller;

import com.balaji.beans.Customer;
import com.balaji.services.CustomerServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerServie servie;

    @PostMapping("/addCustomer")
    public Customer Customer(@RequestBody Customer customer){

        return servie.addCustomer(customer);
    }
}
