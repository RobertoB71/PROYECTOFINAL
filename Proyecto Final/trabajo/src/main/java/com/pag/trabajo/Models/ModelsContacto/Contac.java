package com.pag.trabajo.Models.ModelsContacto;

import java.util.List;

public class Contac {
    private String nombre;
    private String correo;
    private String comentario;
    
    public Contac(String nombre, String correo, String comentario) {
        this.nombre = nombre;
        this.correo = correo;
        this.comentario = comentario;
    }
    public Contac() {
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public void add(List<Contac> contac) {
    }
}
