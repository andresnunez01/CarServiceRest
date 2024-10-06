/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.services.model;

public class Car {
    private int idCar;
    private String color;
    private String model;
    private String brand;
    private String plate;
    private int year;
    private Owner owner;
    
    public Car(){}

    public Car(int idCar, String color, String model, String brand, String plate, int year, Owner owner) {
        this.idCar = idCar;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.plate = plate;
        this.year = year;
        this.owner = owner;
    }

    public int getIdCar() {
        return idCar;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public String getPlate() {
        return plate;
    }

    public int getYear() {
        return year;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

