package com.luv2code.springdemo.rest;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

    // autowire the CustomerService
    @Autowired
    // inject the dependency
    private CustomerService customerService;

    // add mapping for GET/ customers\
    @GetMapping("/customers")
    public List<Customer> getCustomer(){

        return customerService.getCustomers();

    }

    // add mapping for GET/ customers/ {customerId}
    @GetMapping("/customers/{customerId}")
    public Customer getCustomer(@PathVariable int customerId){
        Customer theCustomer = customerService.getCustomer(customerId);

        // if the customerId is not valid
        if (theCustomer == null) {
            throw new CustomerNotFoundException("Customer id not found - " + customerId);

        }
        return theCustomer;
    }

    // add mapping for POST /customers - add new customer
    // use @RequestBody to access the request body as a POJO
    @PostMapping("/customers")
    public Customer addCustomer(@RequestBody Customer theCustomer){

        // just in case the pass an id in JSON ... set id to 0
        // this is force a save of new item ... instead of update
        // if id = 0, DAO "INSERT" new customer
        theCustomer.setId(0);
        customerService.saveCustomer(theCustomer);

        return theCustomer;
    }

    // add mapping for PUT /customers - update existing customer

    @PutMapping("/customers")
    public Customer updateCustomer(@RequestBody Customer theCustomer){
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }

    // add mapping for DELETE /customers/{customerId} - delete customer
    @DeleteMapping("/customers/{customerId}")
    public String deleteCustomer(@PathVariable int customerId){

        Customer tempCustomer = customerService.getCustomer(customerId);

        // check if id exists, throw exception if null
        if (tempCustomer == null) {
            throw new CustomerNotFoundException("Customer id not found - " + customerId);
        }

        customerService.deleteCustomer(customerId);

        return "Deleted customer id - " + customerId;
    }

}
