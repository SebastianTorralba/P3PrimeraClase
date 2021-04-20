/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.objetos;

/**
 *
 * @author TwoBooT
 */
public class Proveedor {
    private String cuit;
    private String razonSocial;
    private String nombreDeFantasia;

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreDeFantasia() {
        return nombreDeFantasia;
    }

    public void setNombreDeFantasia(String nombreDeFantasia) {
        this.nombreDeFantasia = nombreDeFantasia;
    }
    
}
