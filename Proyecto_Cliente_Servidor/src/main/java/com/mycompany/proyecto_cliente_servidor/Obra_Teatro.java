
package com.mycompany.proyecto_cliente_servidor;

import java.util.Date;


public class Obra_Teatro extends Evento implements Manipulacion_Evento{
    
    private String nomObra;
    private String compania;

    public Obra_Teatro(int id,String nomObra, String compania, String nombre,int cantidadTickets,
            Date fecha, String lugar,String organizador, Boleto boleto) {
        super(nombre, id, cantidadTickets, fecha, lugar, organizador, boleto);
        this.nomObra = nomObra;
        this.compania = compania;
    }

    public Obra_Teatro() {
        
    }
    
    
    
        @Override
    public void mostrarEvento() {
        
    }

    @Override
    public void venderEntrada() {
       
    }

    @Override
    public void gestionarDisponibilidad() {
       
    }

    @Override
    public void CrearEvento() {
       
    }
    
    

    public String getNomObra() {
        return nomObra;
    }

    public void setNomObra(String nomObra) {
        this.nomObra = nomObra;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidadTickets() {
        return cantidadTickets;
    }

    public void setCantidadTickets(int cantidadTickets) {
        this.cantidadTickets = cantidadTickets;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }


    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public Object getVoleto() {
        return boleto;
    }

    public void setVoleto(Boleto boleto) {
        this.boleto = boleto;
    }  
    
    @Override
    public String toString() {
        return "Nombre de la obra: "+this.nomObra+ ", Nombre de la compania:"+this.compania +
                ", Nombre del evento: "+this.nombre+", ID del evento: "+this.id+
                ", cantidad de tickets: "+this.cantidadTickets+
                ", fecha: "+this.fecha+", String lugar: "+this.lugar+
                ", Organizador del evento: "+this.organizador+ ", Boleto: "+ boleto+"\n";
    }
}
