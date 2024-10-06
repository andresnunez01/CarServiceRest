/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lasalle.services.controller;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMysql {
    Connection conn;
    public Connection open(){
        String user = "root";
        String password = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
        String params = "?useSSL=false&useUnicode=true&characterEncoding=utf-8";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url+params,user,password);
                    return conn;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    
    public void close(){
        if(conn != null){
            try{
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        }
    }
}
