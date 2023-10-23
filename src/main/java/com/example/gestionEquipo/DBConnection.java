package com.example.gestionEquipo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;
    private DBConnection(){}

    public static Connection getInstance(){
        if (connection == null){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://database-1.cabn5upwsapr.us-east-1.rds.amazonaws.com/gestionEquipo","admin","admin1234");
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return connection;
    }
}
