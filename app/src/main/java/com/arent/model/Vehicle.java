package com.arent.model;

import java.util.List;

public class Vehicle {

    private String brand;
    private String model;
    private int dateOfManufacture;
    private int price;
    private boolean availability;
    private int deposit;
    private String transmission;
    private String wheelHand;
    private String type;
    private int numberOfSeats;
    private String fuel;
    private String description;
    private String hostId;
    private List<String> imagesUrls;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int dateOfManufacture, int price,
                   boolean availability, int deposit, String transmission, String wheelHand,
                   String type, int numberOfSeats, String fuel, String description,
                   String hostId, List<String> imagesUrls) {
        this.brand = brand;
        this.model = model;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
        this.availability = availability;
        this.deposit = deposit;
        this.transmission = transmission;
        this.wheelHand = wheelHand;
        this.type = type;
        this.numberOfSeats = numberOfSeats;
        this.fuel = fuel;
        this.description = description;
        this.hostId = hostId;
        this.imagesUrls = imagesUrls;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getWheelHand() {
        return wheelHand;
    }

    public void setWheelHand(String wheelHand) {
        this.wheelHand = wheelHand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public List<String> getImagesUrls() {
        return imagesUrls;
    }

    public void setImagesUrls(List<String> imagesUrls) {
        this.imagesUrls = imagesUrls;
    }
}
