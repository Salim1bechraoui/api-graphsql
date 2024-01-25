package com.graphqldemo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.graphqldemo.domain.Customer;

public interface  CustomerRepository extends MongoRepository< Customer ,String>  {
    List<Customer> findbyName(String name) ;
    List<Customer> findbyRole(String role ) ;
    
    
}
