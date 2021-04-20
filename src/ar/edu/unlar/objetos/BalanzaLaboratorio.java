/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.objetos;

import ar.edu.unlar.objetos.interfases.IConexionSistema;

/**
 *
 * @author TwoBooT
 */
public class BalanzaLaboratorio extends InstrumentoMedicion implements IConexionSistema{

    @Override
    public int transmitirInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarMedicion() {
        System.out.println("XXXXLKAKASA");
     
    }
    
    
    
}
