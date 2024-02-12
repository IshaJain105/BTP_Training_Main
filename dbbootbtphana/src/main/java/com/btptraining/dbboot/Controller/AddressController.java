package com.btptraining.dbboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.btptraining.dbboot.Entities.Address;
import com.btptraining.dbboot.Service.AddressService;

@RestController
public class AddressController {
    @Autowired
    private AddressService myAddressService;

    @RequestMapping("/addresses")
    public List<Address> getAddresses() {
        return myAddressService.getAllAddresses();
    }

    @RequestMapping("/address/{id}")
    public Optional<Address> getAddressById(@PathVariable("id") String addressId) {
        return myAddressService.getAddressById(addressId);
    }

    @PostMapping("/createAddress")
    public Address createAddress(@RequestBody Address AddressData) {
        return myAddressService.createAddress(AddressData);
    }

}
