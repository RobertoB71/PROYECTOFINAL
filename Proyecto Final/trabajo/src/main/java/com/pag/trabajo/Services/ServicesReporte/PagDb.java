package com.pag.trabajo.Services.ServicesReporte;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pag.trabajo.Models.ModelsReporte.reporte;



public class PagDb {
    Connection _cn;
    public PagDb(){
        _cn = new ConexionReporte().openDbPag();
    }
    public List<reporte> ObtenerInfo(){
        try {
            Statement stmt= _cn.createStatement();
            String query = "Select * from Contacto";

            List<reporte> repor = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                reporte reporteinfo = new reporte(
                    result.getString("info")
                );
                repor.add(reporteinfo);
            }
            result.close();
            stmt.close();
            return repor;
        } catch (Exception e) {
            int x=1;
            System.out.println("Hay error pa "+e);
        }
        return null;
    }
}
