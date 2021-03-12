/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.ejemplogit.programacion.controlador.controlador;

import java.io.Serializable;

/**
 *
 * @author CatalinaGomezJ
 */
public class Venta extends Object implements Serializable{
    private String nombreArticulo;
    private String colorArticulo;

    public Venta(String nombreArticulo, String colorArticulo) {
        this.nombreArticulo = nombreArticulo;
        this.colorArticulo = colorArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getColorArticulo() {
        return colorArticulo;
    }

    public void setColorArticulo(String colorArticulo) {
        this.colorArticulo = colorArticulo;
    }
    
}
