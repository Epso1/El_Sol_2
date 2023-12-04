package com.example.elsol2;

public class Planeta {

    //Planeta, Diámetro, Distancia al sol, Densidad
    private String nombre;
    private String diametro;
    private String distanciaAlSol;
    private String densidad;

    public Planeta(String nombre, String diametro, String distanciaAlSol, String densidad) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.densidad = densidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public String getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public void setDistanciaAlSol(String distanciaAlSol) {
        this.distanciaAlSol = distanciaAlSol;
    }

    public String getDensidad() {
        return densidad;
    }

    public void setDensidad(String densidad) {
        this.densidad = densidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
