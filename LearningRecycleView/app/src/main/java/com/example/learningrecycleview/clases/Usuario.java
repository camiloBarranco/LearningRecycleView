package com.example.learningrecycleview.clases;

import java.io.Serializable;

public class Usuario implements Serializable {
    private String imagen;
    private String nombre;
    private String Descripcion;

    public Usuario(String imagen, String nombre, String descripcion) {
        this.imagen = imagen;
        this.nombre = nombre;
        Descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
