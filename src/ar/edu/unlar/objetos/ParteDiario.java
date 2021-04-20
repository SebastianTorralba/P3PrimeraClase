/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.objetos;

import java.util.ArrayList;

/**
 *
 * @author TwoBooT
 */
public class ParteDiario {
    private ArrayList<Ticket> tickets;
    
    //Patron Delegate

    public int sizeTickets() {
        return tickets.size();
    }

    public boolean addTicket(Ticket ticket) {
        return tickets.add(ticket);
    }

    public boolean removeTicket(Ticket ticket) {
        return tickets.remove(ticket);
    }

    public void clearTickets() {
        tickets.clear();
    }

   
}
