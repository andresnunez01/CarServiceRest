/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.services.rest;

import com.google.gson.Gson;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lasalle.services.controller.ControllerCar;
import org.lasalle.services.model.Car;

/**
 *
 * @author ANDRE
 */
@Path("services")
public class RestPrueba {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("saludar")
    public Response saludar(){
        String out = """
                     {"response":"Hola"}
                     """;
        return Response.ok(out).build();
    }
    
    @Path("guardarCar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response guardarCar(@FormParam("car") String car){
        String out = "";
        Gson gson = new Gson();
        ControllerCar cc = new ControllerCar();
        
        Car auto = gson.fromJson(car, Car.class);
        
        try {
            cc.saveCar(auto);
            out = """
                  {"response":"Insert Succesful!"}
                  """;
        } catch (SQLException ex) {
            Logger.getLogger(RestPrueba.class.getName()).log(Level.SEVERE, null, ex);
            out = """
                  {"response":"Error while insert into DB!"}
                  """;
        }
        return Response.status(Response.Status.BAD_REQUEST).entity(out).build();
        
    }

}

