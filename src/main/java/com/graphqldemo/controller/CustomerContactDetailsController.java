package com.graphqldemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.graphqldemo.domain.CustomerContactDetails;
import com.graphqldemo.service.CustomerContactDetailsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CustomerContactDetailsController {

@Autowired
    CustomerContactDetailsService customerContactDetailsService;
    @GetMapping("/contacts/{emails}")
        public CustomerContactDetails getCustomerByEmail(@PathVariable String email) {

            log.info("Getting customer contact details by email {} ", email);
            CustomerContactDetails customerContactDetails = customerContactDetailsService.getCustomerContactDetailsByEmail(email) ;
            log.info("Received {} customer contact detail by email {}", customerContactDetails.getMobile(), email);
            return customerContactDetails ;
        }
        @PostMapping("/contacts/save")
        public CustomerContactDetails addCustomerContactDetails(@RequestBody CustomerContactDetails customerContactDetails ) {
            log.info("Adding contact details {} to the Database", customerContactDetails.getEmail());
            return  customerContactDetailsService.addCustomerContactDetails(customerContactDetails);

        }


    
}
