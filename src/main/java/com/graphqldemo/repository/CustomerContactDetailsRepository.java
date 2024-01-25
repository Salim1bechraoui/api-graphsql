package com.graphqldemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.graphqldemo.domain.CustomerContactDetails;

import java.util.List;

public interface CustomerContactDetailsRepository extends MongoRepository<CustomerContactDetails,String> {
CustomerContactDetails findByEmail(String email);
CustomerContactDetails findBuMobile(String mobile) ;




    
    
}
