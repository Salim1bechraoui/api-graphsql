package com.graphqldemo.domain;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Customer {
    @Id
    private String id ;
    private String name ;
    private String role ;
    private int age;
    private String contactId ;

    
}
