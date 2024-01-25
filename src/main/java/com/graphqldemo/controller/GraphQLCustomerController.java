package com.graphqldemo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import com.graphqldemo.domain.Customer;
import com.graphqldemo.domain.CustomerContactDetails;
import com.graphqldemo.service.CustomerContactDetailsService;
import com.graphqldemo.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class GraphQLCustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerContactDetailsService customerContactDetailsService;

    @QueryMapping
    public Customer customerById(@Argument String id ) {
                log.info("Quering customer in GraphQL Server by id {}", id);
                Customer customer = customerService.getCustomerById(id);
                return customer;



    }
    @SchemaMapping
    public CustomerContactDetails customerContactDetails(Customer customer) {
        log.info("Quering the Customer Contact Details data for customer {}", customer.getContactId());
        return customerContactDetailsService.getCustomerContactDetailsById(customer.getContactId());


    }
        @MutationMapping
    public Customer addCustomer(@Argument String name, @Argument String role,
                           @Argument int age, @Argument String email,@Argument String mobile, @Argument String address) {

        CustomerContactDetails customerContactDetails = new CustomerContactDetails();
        customerContactDetails.setId(UUID.randomUUID().toString());
        customerContactDetails.setEmail(email);
        customerContactDetails.setMobile(mobile);
        customerContactDetails.setAddress(address);
        customerContactDetailsService.addCustomerContactDetails(customerContactDetails);

        Customer customer = new Customer();
        customer.setId(UUID.randomUUID().toString());
        customer.setName(name);
        customer.setRole(role);
        customer.setAge(age);
        customer.setContactId(customerContactDetails.getId());

        customerService.addCustomer(customer);

        return customer;
    }
}
