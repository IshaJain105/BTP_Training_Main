package com.btptraining.dbboot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.btptraining.dbboot.Entities.Address;

@Component
public class AddressService {
    @Autowired
    IAddressPersistence addressDB;

    // get all addresses
    public List<Address> getAllAddresses() {
        return addressDB.findAll();
    }

    // get single address using address id
    public Optional<Address> getAddressById(String addressId) {
        return addressDB.findById(addressId);
    }

    // create new address except for country = USA
    public Address createAddress(Address addressData) {
        if (addressData.getCountry() == "USA") {
            throw new Error("The USA as country not alllowed. ");
        }
        return addressDB.save(addressData);
    }

}
