/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_cliente_servidor;

import java.util.Date;

/**
 *
 * @author aleja
 */
public abstract class Evento {
    protected String nombre;
    protected int id;
    protected int cantidadTickets;
    protected Date fecha;
    protected String lugar;
    protected String asiento;
    protected String organizador;
    protected Boleto boleto;

    public Evento(String nombre, int id, int cantidadTickets, Date fecha,String lugar,
            String asiento, String organizador, Boleto boleto) {
        this.nombre = nombre;
        this.id = id;
        this.cantidadTickets = cantidadTickets;
        this.fecha = fecha;
        this.lugar = lugar;
        this.asiento = asiento;
        this.organizador = organizador;
        this.boleto = boleto;
    }

    public Evento() {
    }
    
    
    
            
    
}
