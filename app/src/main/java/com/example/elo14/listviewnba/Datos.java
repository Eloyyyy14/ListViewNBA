package com.example.elo14.listviewnba;

import java.io.Serializable;

/**
 * Created by elo14 on 01/11/2017.
 */

public class Datos implements Serializable{
    private int id, imagenLogo, imagenEstadio;
    private String nombre, detalle;

    public Datos(int id, String nombre, String detalle, int imagenLogo, int imagenEstadio){
        this.id=id;
        this.nombre=nombre;
        this.detalle=detalle;
        this.imagenLogo=imagenLogo;
        this.imagenEstadio=imagenEstadio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImagenLogo() {
        return imagenLogo;
    }

    public void setImagenLogo(int imagenLogo) {
        this.imagenLogo = imagenLogo;
    }

    public int getImagenEstadio() { return imagenEstadio;}

    public void setImagenEstadio(int imagenEstadio) { this.imagenEstadio = imagenEstadio; }
}
