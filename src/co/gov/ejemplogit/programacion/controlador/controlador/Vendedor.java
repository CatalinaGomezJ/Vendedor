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
public class Vendedor extends Venta implements Serializable{
    private double antiguedadVendedor;
    public String nombreVendedor;
    private double unidadesVendidas;
    public double prueba;

    public Vendedor(double antiguedadVendedor, String nombreVendedor, double unidadesVendidas, double prueba, String nombreArticulo, String colorArticulo) {
        super(nombreArticulo, colorArticulo);
        this.antiguedadVendedor = antiguedadVendedor;
        this.nombreVendedor = nombreVendedor;
        this.unidadesVendidas = unidadesVendidas;
        this.prueba = prueba;
    }
    
    
}
