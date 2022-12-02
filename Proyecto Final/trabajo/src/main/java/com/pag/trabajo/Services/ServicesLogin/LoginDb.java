package com.pag.trabajo.Services.ServicesLogin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.pag.trabajo.Models.ModelsLogin.Login;



public class LoginDb{
    Connection cn;
    
    public LoginDb(){
        this.cn = new Conexion().openDbLog();
    }
    //Login:)
    public int LoginUser(Login log){
        int resultado=0;
        try{
            Statement smtm = cn.createStatement();
            String query = "SELECT * FROM usuarios WHERE correo = '"+log.getCorreo()+"' AND contraseña = '"+log.getContraseña()+"'";
            ResultSet result = smtm.executeQuery(query);
            if(result.next()){
                return resultado = 1 ;
            }
            result.close();
            smtm.close();
            return resultado;
        }
        catch(Exception ew){
            System.out.println(ew.getMessage());
        }
        return resultado;
    }
//Registro :)
    public int RegistroUser(Login log){
        int resultado = 0;
        try {
            Statement stm = cn.createStatement();
            String query = "exec insertar_Usuario '"+log.getCorreo()+"','"+log.getNombre()+"','"+log.getApellido()+"','"+log.getContraseña()+"'";
            resultado=stm.executeUpdate(query);
            return resultado;
        } catch (SQLException e) {
            System.out.println("Aquí "+e);
            int x = 1;
        }
        catch(Exception e){
            System.out.println("acá"+e);
        }
        return resultado;
    }
}
