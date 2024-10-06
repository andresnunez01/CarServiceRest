/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.services.controller;

import com.google.gson.Gson;
import org.lasalle.services.model.Car;
import org.lasalle.services.model.Owner;

/**
 *
 * @author ANDRE
 */
public class Main {
    public static void main(String[] args) {
         Car car = new Car();
         car.setIdCar(0);
         car.setBrand("Nissan");
         car.setColor("Red");
         car.setModel("Tsuru");
         car.setPlate("GT01R3G");
         car.setYear(2003);
         Owner owner = new Owner();
         owner.setIdOwner(1);
         car.setOwner(owner);
         
         Gson gson = new Gson();
         String carString = gson.toJson(car);
         System.out.println(carString);
    }
}
