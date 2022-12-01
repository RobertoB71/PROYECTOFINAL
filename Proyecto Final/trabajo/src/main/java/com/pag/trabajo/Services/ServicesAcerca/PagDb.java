package com.pag.trabajo.Services.ServicesAcerca;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pag.trabajo.Models.ModelsAcerca.Pag;



public class PagDb {
    Connection _cn;
    public PagDb(){
        _cn = new Conexion().openDbPag();
    }
    public List<Pag> ObtenerInfo(){
        try {
            Statement stmt= _cn.createStatement();
            String query = "Select * from AcercaNosotros";

            List<Pag> Pag = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                Pag paginfo = new Pag(
                    result.getString("info")
                );
                Pag.add(paginfo);
            }
            result.close();
            stmt.close();
            return Pag;
        } catch (Exception e) {
            int x=1;
            System.out.println("Hay error pa "+e);
        }
        return null;
    }
}
