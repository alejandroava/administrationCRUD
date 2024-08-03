package org.example.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static Connection  connection = null;

    public static Connection openConnection(){
        String url = "jdbc:mysql://libreria-bdlibreria.i.aivencloud.com:27584/administrationDB";
        String user = "avnadmin";
        String password="AVNS_qYyQ9hIG_3ugWaXiFJi";

        try{
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Conexion establecida");
        }catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        }
        return connection;
    }

    public void closeConnection(){
        try {
            if(connection != null){
                connection.close();
                System.out.println("Base de datos cerrada");
            }
        }catch (SQLException error){
            throw new RuntimeException();
        }
    }
}
