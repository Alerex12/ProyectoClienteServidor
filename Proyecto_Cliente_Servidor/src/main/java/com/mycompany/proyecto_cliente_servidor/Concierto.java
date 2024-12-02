
package com.mycompany.proyecto_cliente_servidor;

import java.util.Date;

public class Concierto extends Evento implements Manipulacion_Evento{
    
    private String nombreArtista;

    public Concierto(String nombreArtista, String nombre, int id, int cantidadTickets, Date fecha,
            String lugar, String asiento, String organizador, Boleto boleto) {
        super(nombre, id, cantidadTickets, fecha,lugar, asiento, organizador, boleto);
        this.nombreArtista = nombreArtista;
    }

    public Concierto() {
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
    
    
    

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
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

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
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

    public void setVoleto(Boleto voleto) {
        this.boleto = voleto;
    }  
    
    @Override
    public String toString(){
        return "Nombre del artista: "+this.nombreArtista+", Nombre del evento: "+this.nombre+
                ", ID del evento: "+this.id+", cantidad de tickets: "+this.cantidadTickets+
                ", fecha: "+this.fecha+", String lugar: "+this.lugar+
                ", Organizador del evento: "+this.organizador+ ", Boleto: "+ boleto+"\n";
    }
}