package com.arent.model;

import java.util.List;

public class VehicleBrand {

    private String brand;
    private List<String> model;

    public VehicleBrand() {
    }

    public VehicleBrand(String brand, List<String> model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<String> getModel() {
        return model;
    }

    public void setModel(List<String> model) {
        this.model = model;
    }
}
