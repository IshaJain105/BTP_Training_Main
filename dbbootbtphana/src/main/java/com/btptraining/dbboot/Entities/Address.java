package com.btptraining.dbboot.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
    

@Entity
public class Address {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(nullable = false, name = "ID")
    private String addressId;

    @Column(name = "TYPE")
    private String addressType;

    @Column(name = "REGION")
    private String region;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CITY")
    private String city;


    public Address(){

    }

    public Address(String addressId, String addressType, String region, String country, String city) {
        this.addressId = addressId;
        this.addressType = addressType;
        this.region = region;
        this.country = country;
        this.city = city;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    
    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
