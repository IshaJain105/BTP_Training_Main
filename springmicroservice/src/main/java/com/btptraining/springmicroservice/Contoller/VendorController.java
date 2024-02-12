package com.btptraining.springmicroservice.Contoller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.btptraining.springmicroservice.entities.Vendor;
import com.btptraining.springmicroservice.services.VendorService;
import org.springframework.web.bind.annotation.RequestMapping;



//mark it as a microservice
@RestController
public class VendorController {
    
    @Autowired
    private VendorService myVendorService;

    @RequestMapping(value="/vendors")
    public HashMap<String, Vendor> getAll(){
        return myVendorService.getAllVendors();
    }
    
}
