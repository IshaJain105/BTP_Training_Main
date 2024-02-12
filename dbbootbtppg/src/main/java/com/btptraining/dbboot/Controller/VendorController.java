package com.btptraining.dbboot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.btptraining.dbboot.Entities.Vendor;
import com.btptraining.dbboot.Service.VendorService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;

//mark it as a microservice
@RestController
public class VendorController {

    @Autowired
    private VendorService myVendorService;

    @RequestMapping(value = "/vendors")
    public List<Vendor> getAll() {
        return myVendorService.getAllVendors();
    }

    @RequestMapping(value = "/vendor/{id}")
    public Optional<Vendor> getVendorById(@PathVariable("id") String code) {
        return myVendorService.getVendorById(code);
    }

    @PostMapping("/vendors")
    public Vendor createVendor(@RequestBody Vendor newVendor) {
        return myVendorService.addVendor(newVendor);
    }

    @PutMapping(value = "/updateVendor/{id}")
    public Vendor updateVendorById(@PathVariable String id, @RequestBody Vendor vendorData) {
        return myVendorService.updateVendorById(id, vendorData);
    }

    @DeleteMapping("/deleteVendor/{id}")
    public String deleteVendorById(@PathVariable String id) {
        return myVendorService.deleteVendor(id);
    }

    // @RequestMapping(value = "/vendor/company/{id}")
    // public List<Vendor> getVendorByCompanyName(@PathVariable("id") String company) {
    //     return myVendorService.getVendorByCompanyName(company);
    // }

    @RequestMapping(value = "/vendor/company")
    public List<Vendor> getVendorByCompanyName(@RequestParam String company) {
        return myVendorService.getVendorByCompanyName(company);
    }

    @RequestMapping(value = "/vendor/email/{id}")
    public List<Vendor> getVendorByEmailType(@PathVariable("id") String email) {
        return myVendorService.getVendorByEmailType(email);
    }
}
