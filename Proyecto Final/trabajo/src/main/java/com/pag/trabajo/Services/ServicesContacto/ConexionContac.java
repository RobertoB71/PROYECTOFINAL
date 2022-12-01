package com.pag.trabajo.Services.ServicesContacto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionContac {
    public Connection openDbContac(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
            +"databaseName=paginaweb;"
            +"user=sa;"
            +"password=12345678;"
            +"trustServerCertificate=true";
            Connection cone = DriverManager.getConnection(connectionUrl);
            return cone;
        } catch (SQLException e) {
            System.out.println("Error al conectarse "+e);
        }
        catch(Exception err){
            System.out.println("Error de quien sabe qué "+err);
        }
        return null;
    }
}
