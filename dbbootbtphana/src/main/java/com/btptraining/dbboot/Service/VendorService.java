package com.btptraining.dbboot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.btptraining.dbboot.Entities.Vendor;

@Component
public class VendorService {
    @Autowired
    IVendorPersistence vendorDB;
    
    // read all vendors - return a internal table(ITab)
    public List<Vendor> getAllVendors() {
        return vendorDB.findAll();
    }

    // read a single vendor using Key
    public Optional<Vendor> getVendorById(String VendorId) {
        return vendorDB.findById(VendorId);
    }

    // add new vendor(append)
    public Vendor addVendor(Vendor newVendor) {
        return vendorDB.save(newVendor);
    }

    // updating vendor using id
    public Vendor updateVendorById(String vendorId, Vendor vendorData) {
        return vendorDB.save(vendorData);
    }

    // deleting vendor using id
    public String deleteVendor(String vendorId) {
        vendorDB.deleteById(vendorId);
        return "Data deleted Successfully.";
    }

    //get by company name
    public List<Vendor> getVendorByCompanyName(String company) {
        return vendorDB.getByCompanyName(company);
    }

    //get by email type
    public List<Vendor> getVendorByEmailType(String type) {
        return vendorDB.getByEmailType(type);
    }

}
