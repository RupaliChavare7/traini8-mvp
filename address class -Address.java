package com.traini8.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;

    // Getters and Setters
}