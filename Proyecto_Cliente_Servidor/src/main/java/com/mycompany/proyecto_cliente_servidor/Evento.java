package com.mycompany.proyecto_cliente_servidor;

import java.util.Date;

/**
 *
 * @author aleja
 */

//clase abstracta evento de la cual heredan los demas eventos del programa
public abstract class Evento {
    protected String nombre;
    protected int id;
    protected int cantidadTickets;
    protected Date fecha;
    protected String lugar;
    protected String organizador;
    protected Boleto boleto;

    public Evento(String nombre, int id, int cantidadTickets, Date fecha,String lugar,
           String organizador, Boleto boleto) {
        this.nombre = nombre;
        this.id = id;
        this.cantidadTickets = cantidadTickets;
        this.fecha = fecha;
        this.lugar = lugar;
        this.organizador = organizador;
        this.boleto = boleto;
    }

    public Evento() {
    }
    
    
    
            
    
}
