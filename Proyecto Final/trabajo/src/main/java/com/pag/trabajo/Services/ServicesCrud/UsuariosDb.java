package com.pag.trabajo.Services.ServicesCrud;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pag.trabajo.Models.ModelsCrud.Usuarios;

public class UsuariosDb {
  Connection _cn;

  public UsuariosDb() {
    _cn = new Conexion().openDbLog();
  }

  public List<Usuarios> ObtenerUsuarios() {
    try {
      Statement stmt = _cn.createStatement();
      String query = "SELECT * FROM productos";

      List<Usuarios> user = new ArrayList<>();
      ResultSet result = stmt.executeQuery(query);
      while (result.next()) {
        Usuarios usuarios = new Usuarios(
            result.getString("correo"),
            result.getString("nombre"),
            result.getString("apellido"),
            result.getString("telefono"),
            result.getString("contraseña"),
            result.getString("fotoUrl")
            );

        Usuarios.add(usuarios);
      }

      result.close();
      stmt.close();
      return user;

    } catch (Exception e) {
      int x = 1;
    }
    return null;
  }

  public int GuardarUsuarios(Usuarios usuario) {
    int resultado = 0;
    try {
      Statement stm = _cn.createStatement();
      String query = "Call InsertarUsuario('"
          + usuario.getCorreo() + "',"
          + usuario.getNombre() + "',"
          + usuario.getApellido() + "',"
          + usuario.getTelefono() + "',"
          + usuario.getContraseña() + ","
          + usuario.getFoto() + "')";

      resultado = stm.executeUpdate(query);

      return resultado;
    } catch (Exception e) {
      int x = 1;
    }
    return resultado;
  }

  public int ActualizarUsuarios(Usuarios usuario) {
    int resultado = 0;
    try {
      Statement stm = _cn.createStatement();
      String query = "exec ActualizarUsuario("
          + usuario.getCorreo() + "',"
          + usuario.getNombre() + "',"
          + usuario.getApellido() + "',"
          + usuario.getTelefono() + "',"
          + usuario.getContraseña() + ","
          + usuario.getFoto() + "')";

      resultado = stm.executeUpdate(query);

      return resultado;
    } catch (Exception e) {
      int x = 1;
    }
    return resultado;
  }

  public int EliminarUsuario(int pid) {
    int resultado = 0;
    try {
      Statement stmt = _cn.createStatement();
      String query = "exec EliminarUsuario(" + pid + ")";

      return stmt.executeUpdate(query);

    } catch (Exception e) {
      int x = 1;
    }
    return resultado;
  }

}
