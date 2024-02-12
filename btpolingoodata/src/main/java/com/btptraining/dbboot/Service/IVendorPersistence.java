package com.btptraining.dbboot.Service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.btptraining.dbboot.Entities.Vendor;

public interface IVendorPersistence extends JpaRepository<Vendor, String> {

    List<Vendor> findByCompanyName(String companyName);

    @Query(nativeQuery = true, value = "SELECT * FROM public.vendor where EMAIL like %?1%")
    List<Vendor> lookupVendorByEmailId(String emailId);

}