package com.btptraining.springmicroservice.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.btptraining.springmicroservice.entities.Vendor;

@Component
public class VendorService {
    // Internal table in java which can store multiple object
    // Vendor Objects
    private HashMap<String, Vendor> vendors = new HashMap<String, Vendor>();

    @Autowired
    private Vendor v1;
    @Autowired
    private Vendor v2;
    @Autowired
    private Vendor v3;

    private void fillVendor() {
        vendors.put("1", v1);
        vendors.put("2", v2);
        vendors.put("3", v3);
        v1.setCode("VEND1");
        v2.setCode("VEND2");
        v3.setCode("VEND3");
    }

    public VendorService() {
        // fillVendor();
    }

    // read all vendors - return a internal table(ITab)
    public HashMap<String, Vendor> getAllVendors() {
        fillVendor();
        return vendors;
    }

    // read a single vendor using Key
    public Vendor getVendorById(String VendorId) {
        fillVendor();
        return vendors.get(VendorId);
    }

    // add new vendor(append)
    public Vendor addVendor(Vendor newVendor) {
        fillVendor();
        vendors.put("4", newVendor);
        return newVendor;
    }

    // updating vendor using id
    public Vendor updateVendorById(String vendorId, Vendor vendorData) {
        fillVendor();
        vendors.put(vendorId, vendorData);
        return vendorData;
    }

    // deleting vendor using id
    public Void deleteVendor(String vendorId) {
        fillVendor();
        vendors.remove(vendorId);
        return null;
    }

}
