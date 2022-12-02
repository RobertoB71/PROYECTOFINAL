package com.pag.trabajo.Models.ModelsCrud;
public class Usuarios {
  private String Correo;
  private String Nombre;
  private String Apellido;
  private String Telefono;
  private String Contraseña;
  private String Foto;

  public Usuarios(String correo, String nombre, String apellido, String telefono, String contraseña, String foto) {
    Correo = correo;
    Nombre = nombre;
    Apellido = apellido;
    Telefono = telefono;
    Contraseña = contraseña;
    Foto = foto;
  }

  public String getCorreo() {
    return Correo;
  }

  public void setCorreo(String correo) {
    Correo = correo;
  }

  public String getNombre() {
    return Nombre;
  }

  public void setNombre(String nombre) {
    Nombre = nombre;
  }

  public String getApellido() {
    return Apellido;
  }

  public void setApellido(String apellido) {
    Apellido = apellido;
  }

  public String getTelefono() {
    return Telefono;
  }

  public void setTelefono(String telefono) {
    Telefono = telefono;
  }

  public String getContraseña() {
    return Contraseña;
  }

  public void setContraseña(String contraseña) {
    Contraseña = contraseña;
  }

  public String getFoto() {
    return Foto;
  }

  public void setFoto(String foto) {
    Foto = foto;
  }

  public static void add(Usuarios usuarios) {
  }

}
