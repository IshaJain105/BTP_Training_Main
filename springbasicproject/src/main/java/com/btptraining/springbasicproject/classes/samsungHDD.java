package com.btptraining.springbasicproject.classes;

import org.springframework.stereotype.Component;

@Component
public class samsungHDD implements IHardDisk {

    @Override
    public void startHDD() {
        System.out.println("Samsung Harddisk started");
    }

    @Override
    public void readHDD() {
        System.out.println("Samsung Harddisk Reading @speed  200m rps");
    }
    
}
