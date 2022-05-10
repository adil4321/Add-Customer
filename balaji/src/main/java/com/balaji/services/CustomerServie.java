package com.balaji.services;

import com.balaji.beans.Customer;
import com.balaji.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerServie {

    @Autowired
    private CustomerRepo repo;

    public Customer addCustomer(@RequestBody Customer customer){
        return repo.save(customer);
    }

}
