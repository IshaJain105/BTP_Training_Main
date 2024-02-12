package com.btptraining.springbasicproject.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//bean
@Component
public class Laptop {
    // class attributes
    private Integer length;
    private Integer width;
    private String brandName;
    @Autowired
    private IHardDisk hardDisk;

    public Laptop() {

        //Hardcoded sony Harddisk 
        //Tight coupling+We ouself managing the object of the dependency(harddisk)
        //old approach
        //hardDisk=new sonyHDD();
        System.out.println("Laptop object is created.");
    }

    public void Boot(){
        hardDisk.startHDD();
        System.out.println("Strating the laptop with brand"+ brandName);
        hardDisk.readHDD();
    }

    @Override
    public String toString() {
        return "Laptop [length=" + length + ", width=" + width + ", brandName=" + brandName + "]";
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
