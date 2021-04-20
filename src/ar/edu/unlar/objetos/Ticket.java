/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.objetos;

import java.util.Date;

/**
 *
 * @author TwoBooT
 */
public class Ticket {
    private int numero;
    private int peso;
    private Date fecha;
    private int pesoIngreso;
    private int pesoEgreso;
    private Camion camion;
    private Proveedor proveedor;
    private Producto producto;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getPesoIngreso() {
        return pesoIngreso;
    }

    public void setPesoIngreso(int pesoIngreso) {
        this.pesoIngreso = pesoIngreso;
    }

    public int getPesoEgreso() {
        return pesoEgreso;
    }

    public void setPesoEgreso(int pesoEgreso) {
        this.pesoEgreso = pesoEgreso;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
}
