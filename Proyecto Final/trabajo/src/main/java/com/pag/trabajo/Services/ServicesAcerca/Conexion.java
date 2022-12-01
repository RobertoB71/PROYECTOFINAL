package com.pag.trabajo.Services.ServicesAcerca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection openDbPag(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
            +"databaseName=paginaweb;"
            +"user=sa;"
            +"password=12345678;"
            +"trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;

        } catch (SQLException e) {
            System.out.println("Error al conectarse"+e);
        }
        catch(Exception err){
            System.out.println("Error quien sabe de qué "+err);
        }
        return null;
    }
}
