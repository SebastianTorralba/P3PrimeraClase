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
// CamelCase Clases
// lowerCamelCase variables metodos
public class Camion {
    private String marca;
    private int modelo;
    private String patente;
    private int vin;
    private int serieMotor;

    public int getSerieMotor() {
        return serieMotor;
    }

    public void setSerieMotor(int serieMotor) {
        this.serieMotor = serieMotor;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
    
    
    
    public String getPatente() {
        return patente;
    }

   
    public void setPatente(String patente) {
        this.patente = patente;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    
    
    
}
