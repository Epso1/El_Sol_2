package com.example.elsol2;

public class SolarItem {
    String titulo;
    Integer imagen;

    public SolarItem(String titulo, Integer imagen) {
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getImagen() {
        return imagen;
    }
}
