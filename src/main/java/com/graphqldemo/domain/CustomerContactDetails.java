package com.graphqldemo.domain;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerContactDetails {
    @Id
     private String id ;
     private String email;
     private String mobile ;
     private String address ;
     public CustomerContactDetails(String id, String email, String mobile) {
        this.id = id;
        this.email = email;
        this.mobile = mobile;
    }
    public CustomerContactDetails() {}

    
}
