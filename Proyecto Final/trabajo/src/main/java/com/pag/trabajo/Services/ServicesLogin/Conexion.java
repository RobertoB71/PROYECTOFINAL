package com.pag.trabajo.Services.ServicesLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection openDbLog(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl="jdbc:sqlserver://localhost:1433;"
            +"databaseName=paginaweb;"
            +"user=sa;"
            +"password=12345678;"
            +"trustServerCertificate=true";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (ClassNotFoundException e) {
            System.out.println("Error es : "+e);
        }catch(SQLException err){
            System.out.println("Error es : "+err);
        }
        return null;
    }
}
