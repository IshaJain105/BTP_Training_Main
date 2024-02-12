package com.btptraining.dbboot.Service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btptraining.dbboot.Entities.Address;

public interface IAddressPersistence extends JpaRepository<Address, String> {
    
}
