package com.btptraining.springbasicproject.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class sonyHDD implements IHardDisk {

    @Override
    public void startHDD() {
        System.out.println("Sony Harddisk started");
    }

    @Override
    public void readHDD() {
        System.out.println("Sony Harddisk Reading @speed  10m rps");
    }
    
}
