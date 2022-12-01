package com.pag.trabajo.Services.ServicesContacto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pag.trabajo.Models.ModelsContacto.Contac;

public class ContactDb {
    Connection _cn;
    public ContactDb(){
        _cn = new ConexionContac().openDbContac();
    }

    public List<Contac> ObtenerContacto(){
        try {
            Statement stmt = _cn.createStatement();
            String query = "Select * from Contacto";

            List<Contac> Contac = new ArrayList<>();
            ResultSet result = stmt.executeQuery(query);
            while(result.next()){
                Contac contacto = new Contac(
                    result.getString("nombre"),
                    result.getString("correo"),
                    result.getString("comentario")
                );
                Contac.add(contacto);
            }
            result.close();
            stmt.close();

            return Contac;
        } catch (Exception e) {
            System.out.println("Hay error pa "+e);
        }
        return null;
    }
    
    public int GuardarContacto(Contac contacto){
        int resultado = 0;
        try {
            Statement stm = _cn.createStatement();
            String query = "exec insertar_contacto '"+contacto.getNombre()+"','"+contacto.getCorreo()+"','"+contacto.getComentario()+"'";

            resultado=stm.executeUpdate(query);

            return resultado;
        } catch (SQLException e) {
            System.out.println("es aquí "+e);
            int x = 1;
        }
        catch(Exception e){
            System.out.println("acá "+e);
        }
        return resultado;
    }
}

