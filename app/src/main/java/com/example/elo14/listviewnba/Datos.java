package com.example.elo14.listviewnba;

import java.io.Serializable;

/**
 * Created by elo14 on 01/11/2017.
 */

public class Datos implements Serializable{
    private int id, imagenLogo, imagenEstadio, imagenJugador, imagenEquipacionLocal, imagenEquipacionVisitante, imagenLogo2;
    private String nombreEquipo, detalle, url, nombreJugador, nombreEstadio, detalleJugador, detalleEstadio;

    public Datos(int id, String nombreEquipo, String detalle, int imagenLogo, int imagenEstadio, String nombreEstadio,
                 String detalleEstadio, String url, int imagenEquipacionLocal, int imagenEquipacionVisitante, int imagenLogo2,
                 int imagenJugador, String nombreJugador, String detalleJugador){

        this.id=id;
        this.nombreEquipo=nombreEquipo;
        this.detalle=detalle;
        this.imagenLogo=imagenLogo;
        this.imagenEstadio=imagenEstadio;
        this.nombreEstadio=nombreEstadio;
        this.detalleEstadio=detalleEstadio;
        this.url=url;
        this.imagenEquipacionLocal=imagenEquipacionLocal;
        this.imagenEquipacionVisitante=imagenEquipacionVisitante;
        this.imagenLogo2=imagenLogo2;
        this.imagenJugador=imagenJugador;
        this.nombreJugador=nombreJugador;
        this.detalleJugador=detalleJugador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEquipo() {return nombreEquipo;}

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
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

    public String getNombreEstadio() { return nombreEstadio;}

    public void setNombreEstadio(String nombreEstadio) { this.nombreEstadio = nombreEstadio; }

    public String getDetalleEstadio() {
        return detalleEstadio;
    }

    public void setDetalleEstadio(String detalleEstadio) {this.detalleEstadio = detalleEstadio; }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) { this.url = url; }

    public int getImagenEquipacionLocal() { return imagenEquipacionLocal;}

    public void setImagenEquipacionLocal(int imagenEquipacionLocal) { this.imagenEquipacionLocal = imagenEquipacionLocal; }

    public int getImagenEquipacionVisitante() { return imagenEquipacionVisitante;}

    public void setImagenEquipacionVisitante(int imagenEquipacionVisitante) { this.imagenEquipacionVisitante = imagenEquipacionVisitante; }

    public int getImagenLogo2() {
        return imagenLogo2;
    }

    public void setImagenLogo2(int imagenLogo2) {
        this.imagenLogo2 = imagenLogo2;
    }

    public int getImagenJugador() {
        return imagenJugador;
    }

    public void setImagenJugador(int imagenJugador) {
        this.imagenJugador = imagenJugador;
    }

    public String getNombreJugador() {return nombreJugador;}

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getDetalleJugador() {return detalleJugador;}

    public void setDetalleJugador(String detalleJugador) {
        this.detalleJugador = detalleJugador;
    }

}
