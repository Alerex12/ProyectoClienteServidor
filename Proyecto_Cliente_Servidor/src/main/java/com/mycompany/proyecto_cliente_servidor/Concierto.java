
package com.mycompany.proyecto_cliente_servidor;

import java.util.Date;

public class Concierto extends Evento implements Manipulacion_Evento{
    
    private String nombreArtista;

    public Concierto(int id,String nombreArtista, String nombre,int cantidadTickets, Date fecha,
            String lugar, String organizador) {
        super(nombre, id, cantidadTickets, fecha,lugar,organizador);
        this.nombreArtista = nombreArtista;
    }

    public Concierto() {
    }
    
    //Los metodos estan vacios ya que todavia no se decide si se haran aqui o en la clase servidor
    @Override
    public void mostrarEvento() {
        
    }


    @Override
    public void gestionarDisponibilidad() {
        
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

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    } 
    
    @Override
    public String toString(){
        return "Nombre del artista: "+this.nombreArtista+", Nombre del evento: "+this.nombre+
                ", ID del evento: "+this.id+", cantidad de tickets: "+this.cantidadTickets+
                ", fecha: "+this.fecha+", String lugar: "+this.lugar+
                ", Organizador del evento: "+this.organizador+ "\n";
    }
}
